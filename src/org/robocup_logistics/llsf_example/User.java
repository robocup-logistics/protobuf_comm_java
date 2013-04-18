package org.robocup_logistics.llsf_example;

import java.io.IOException;

import org.robocup_logistics.llsf_comm.ProtobufClient;
import org.robocup_logistics.llsf_comm.ProtobufMessage;
import org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage;
import org.robocup_logistics.llsf_msgs.PuckInfoProtos.PuckInfo;


public class User {
	
	public static void main(String[] args) {
		
		ProtobufClient client = new ProtobufClient("localhost", 4444);
		try {
			client.connect();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		client.<PuckInfo>add_message(PuckInfo.class);
		
		Handler handler = new Handler();
		client.register_handler(handler);
		
		AttentionMessage am = AttentionMessage.newBuilder().setMessage("Hey!").setTimeToShow(20).build();
		
		ProtobufMessage msg = new ProtobufMessage(2000,2);
		msg.set_message(am);
		
		client.enqueue(msg);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		client.disconnect();
		
	}

}

