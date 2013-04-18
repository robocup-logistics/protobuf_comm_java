package org.robocup_logistics.llsf_comm;

import java.nio.ByteBuffer;

import com.google.protobuf.GeneratedMessage;

public interface ProtobufMessageHandler {
	
	public void handle_message(ByteBuffer in_msg, GeneratedMessage msg);

}
