package org.robocup_logistics.llsf_example;

import java.io.IOException;

import org.robocup_logistics.llsf_comm.ProtobufBroadcastPeer;
import org.robocup_logistics.llsf_comm.ProtobufClient;
import org.robocup_logistics.llsf_comm.ProtobufMessage;
import org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage;
import org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal;
import org.robocup_logistics.llsf_msgs.PuckInfoProtos.PuckInfo;
import org.robocup_logistics.llsf_msgs.TimeProtos.Time;

public class User {
	
	public static void main(String[] args) {
		
		//Send and receive message via stream
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

		
		//Send and receive message via broadcast
		//IMPORTANT: You need to send to and listen on udp port 4445 to send/receive broadcast messages
		//to/from the refbox. In this example the receive port is set to 4446, because if you start a 
		//refbox locally, it will listen on port 4445 itself. Thus you won't be able to receive
		//anything from the actual refbox. If you want to test the receiving of broadcast messages,
		//change the send port to 4446 to. If you do so, you won't communicate with your local refbox
		//anymore, but you will receive any messages sent by yourself.
		//If you don't use a local refbox, just change the receive port to 4445.
		ProtobufBroadcastPeer peer = new ProtobufBroadcastPeer("localhost",4445,4446);
		try {
			peer.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

		peer.<BeaconSignal>add_message(BeaconSignal.class);
		peer.register_handler(handler);

		int sec = (int) (System.currentTimeMillis() / 1000);
		long nsec = System.nanoTime();
		Time t = Time.newBuilder().setSec(sec).setNsec(nsec).build();
		BeaconSignal bs = BeaconSignal.newBuilder().setTime(t).setSeq(1).setPeerName("It's").setTeamName("me").build();
		
		msg = new ProtobufMessage(2000,1);
		msg.set_message(bs);
		
		peer.enqueue(msg);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		client.disconnect();
		peer.stop();
		
	}

}

