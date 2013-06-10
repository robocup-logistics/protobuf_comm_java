package org.robocup_logistics.llsf_example;

import java.nio.ByteBuffer;
import java.util.List;

import org.robocup_logistics.llsf_comm.ProtobufMessageHandler;
import org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal;
import org.robocup_logistics.llsf_msgs.RobotInfoProtos.Robot;
import org.robocup_logistics.llsf_msgs.RobotInfoProtos.RobotInfo;
import org.robocup_logistics.llsf_msgs.TimeProtos.Time;


import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.InvalidProtocolBufferException;

public class Handler implements ProtobufMessageHandler {
	
	public void handle_message(ByteBuffer in_msg, GeneratedMessage msg) {
		
		if (msg instanceof RobotInfo) {
			
			byte[] array = new byte[in_msg.capacity()];
			in_msg.rewind();
			in_msg.get(array);
			RobotInfo info;
			
			try {
				info = RobotInfo.parseFrom(array);
				int count = info.getRobotsCount();
				System.out.println("Number of robots: " + count);
				List<Robot> robots = info.getRobotsList();
				for (int i = 0; i < robots.size(); i++) {
					Robot robot = robots.get(i);
					String name = robot.getName();
					String team = robot.getTeam();
					int number = robot.getNumber();
					System.out.println("  robot #" + number + ": " + name + " - " + team);
				}
				
			} catch (InvalidProtocolBufferException e) {
				e.printStackTrace();
			}
			
		} else if (msg instanceof BeaconSignal) {

			byte[] array = new byte[in_msg.capacity()];
			in_msg.rewind();
			in_msg.get(array);
			BeaconSignal bs;
			Time t;
			
			try {
				bs = BeaconSignal.parseFrom(array);
				t = bs.getTime();
				System.out.println("Time: " + t.getSec() + ", " + t.getNsec());
				System.out.println("names: " + bs.getPeerName() + " " + bs.getTeamName());
				
			} catch (InvalidProtocolBufferException e) {
				e.printStackTrace();
			}
			
		}
	}
}
