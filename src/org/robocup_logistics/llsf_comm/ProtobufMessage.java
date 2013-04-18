package org.robocup_logistics.llsf_comm;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import com.google.protobuf.GeneratedMessage;

public class ProtobufMessage {
	
	protected int cmp_id;
	protected int msg_id;
	protected int size;
	protected byte[] msg;
	
	public ProtobufMessage(int cmp_id, int msg_id) {
		this.cmp_id = cmp_id;
		this.msg_id = msg_id;
		this.size = 0;
		this.msg = null;
	}
	
	public ProtobufMessage(int cmp_id, int msg_id, GeneratedMessage gmsg) {
		this.cmp_id = cmp_id;
		this.msg_id = msg_id;
		this.set_message(gmsg);
	}
	
	public int get_component_id() {
		return this.cmp_id;
	}
	
	public int get_message_id() {
		return this.msg_id;
	}
	
	public int get_size() {
		return this.size;
	}
	
	public byte[] get_message() {
		return this.msg;
	}
	
	public void set_component_id(int cmp_id) {
		this.cmp_id = cmp_id;
	}
	
	public void set_message_id(int msg_id) {
		this.msg_id = msg_id;
	}
	
	public void set_message(GeneratedMessage gmsg) {
		int cmp = (int) Math.pow(2,31) - 1;
		byte[] msg = gmsg.toByteArray();
		if (msg.length > cmp) {
			//throw new FawkesNetworkMessageTooBigException("Network Message size too big");
		} else {
			this.size = msg.length;
			this.msg = msg;
		}
	}
	
	public ByteBuffer serialize() {
		ByteBuffer buf = ByteBuffer.allocate(this.size + 8).order(ByteOrder.BIG_ENDIAN);
		if (this.cmp_id == -1 || this.msg_id == -1) {
			return null;
			//throw new FawkesNetworkMessageUnknownIDException("Unknown component or message ID");
		} else {
			buf.putShort((short) this.cmp_id).putShort((short) this.msg_id).putInt(this.size);
			buf.put(this.msg);
			return (ByteBuffer) buf.rewind();	
		}
	}
	

}
