package org.robocup_logistics.llsf_example;

import java.io.IOException;

import org.robocup_logistics.llsf_comm.ProtobufBroadcastPeer;
import org.robocup_logistics.llsf_comm.ProtobufClient;
import org.robocup_logistics.llsf_comm.ProtobufMessage;
import org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal;
import org.robocup_logistics.llsf_msgs.RobotInfoProtos.RobotInfo;
import org.robocup_logistics.llsf_msgs.TimeProtos.Time;
import org.robocup_logistics.llsf_tools.NanoSecondsTimestampProvider;

public class User {
	
	public static void main(String[] args) {
		
		//Send and receive message via broadcast
		//IMPORTANT: If you want to connect to a remote refbox, set both ports to 4444.
		//If you want to communicate with a local refbox (as in this example), you need to
		//set the send port to 4445 and edit the refbox's config.yaml as described in the
		//Configuration tutorial. This is required, because your refbox and your Java program
		//cannot listen on the same ports. After changing the configuration, your local refbox
		//will listen on port 4445 and send to port 4444, so your send and receive ports have
		//to be inverted.
		//See the Usage tutorial for more information: https://trac.fawkesrobotics.org/wiki/LLSFRefBox/Java/Usage
		ProtobufBroadcastPeer peer = new ProtobufBroadcastPeer("localhost",4445,4444);
		try {
			peer.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		peer.<RobotInfo>add_message(RobotInfo.class);
		
		Handler handler = new Handler();
		peer.register_handler(handler);
		
		NanoSecondsTimestampProvider nstp = new NanoSecondsTimestampProvider();

		long ms = System.currentTimeMillis();
		long ns = nstp.currentNanoSecondsTimestamp();

		int sec = (int) (ms / 1000);
		long nsec = ns - (ms * 1000000L);
				
		Time t = Time.newBuilder().setSec(sec).setNsec(nsec).build();
		BeaconSignal bs = BeaconSignal.newBuilder().setTime(t).setSeq(1).setNumber(1).setPeerName("R-1").setTeamName("YourTeam").build();
		
		ProtobufMessage msg = new ProtobufMessage(2000,1,bs);
		peer.enqueue(msg);
		
		//Send and receive message via stream
		ProtobufClient client = new ProtobufClient("localhost", 4444);
		try {
			client.connect();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		client.<RobotInfo>add_message(RobotInfo.class);
		client.register_handler(handler);

		ms = System.currentTimeMillis();
		ns = nstp.currentNanoSecondsTimestamp();
		
		sec = (int) (ms / 1000);
		nsec = ns - (ms * 1000000L);
		
		t = Time.newBuilder().setSec(sec).setNsec(nsec).build();
		bs = BeaconSignal.newBuilder().setTime(t).setSeq(1).setNumber(1).setPeerName("R-1").setTeamName("YourTeam").build();
		
		msg = new ProtobufMessage(2000,1,bs);
		client.enqueue(msg);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

		peer.stop();
		client.disconnect();
		
	}

}

