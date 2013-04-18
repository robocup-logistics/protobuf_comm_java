package org.robocup_logistics.llsf_example;

import java.nio.ByteBuffer;
import java.util.List;

import org.robocup_logistics.llsf_comm.ProtobufMessageHandler;
import org.robocup_logistics.llsf_msgs.PuckInfoProtos.Puck;
import org.robocup_logistics.llsf_msgs.PuckInfoProtos.PuckInfo;


import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.InvalidProtocolBufferException;

public class Handler implements ProtobufMessageHandler {
	
	public void handle_message(ByteBuffer in_msg, GeneratedMessage msg) {
		
		if (msg instanceof PuckInfo) {
			
			byte[] array = new byte[in_msg.capacity()];
			in_msg.rewind();
			in_msg.get(array);
			PuckInfo info;
			
			try {
				info = PuckInfo.parseFrom(array);
				int count = info.getPucksCount();
				System.out.println("Anzahl Pucks: " + count);
				List<Puck> pucks = info.getPucksList();
				for (int i = 0; i < pucks.size(); i++) {
					Puck puck = pucks.get(i);
					int id = puck.getId();
					System.out.println("  Puck-ID: " + id);
				}
				
			} catch (InvalidProtocolBufferException e) {
				e.printStackTrace();
			}
			
		}
	}
}
