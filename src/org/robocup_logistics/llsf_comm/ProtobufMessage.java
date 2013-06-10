package org.robocup_logistics.llsf_comm;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import com.google.protobuf.GeneratedMessage;

/**
 * This class is a wrapper for protobuf messages. It is used to identify incoming messages
 * via the component and message IDs. To send a protobuf message, create an instance of
 * this class with the same component ID and message ID as defined in the corresponding .proto file
 * of the protobuf message you want to send. Then use the setter to add an instance of the actual
 * protobuf message. You can find a detailed example in the tutorial.
 */
public class ProtobufMessage {
	
	protected int cmp_id;
	protected int msg_id;
	protected int size;
	protected byte[] msg;
	
	/**
	 * Instantiates a new ProtobufMessage. Pass the same component ID and message ID as defined in
	 * the corresponding .proto file of the protobuf message you want to send.
	 * 
	 * @param cmp_id
	 *            the component ID defined in the .proto file
	 * @param msg_id
	 *            the message ID defined in the .proto file
	 */
	public ProtobufMessage(int cmp_id, int msg_id) {
		this.cmp_id = cmp_id;
		this.msg_id = msg_id;
		this.size = 0;
		this.msg = null;
	}
	
	/**
	 * Instantiates a new ProtobufMessage with an instance of the actual protobuf message. 
	 * Pass the same component ID and message ID as defined in the corresponding .proto file
	 * of the protobuf message you want to send. You can find a detailed example in the tutorial.
	 * 
	 * @param cmp_id
	 *            the component ID defined in the .proto file
	 * @param msg_id
	 *            the message ID defined in the .proto file
	 * @param gmsg
	 *            the instance of the actual protobuf message
	 */
	public ProtobufMessage(int cmp_id, int msg_id, GeneratedMessage gmsg) {
		this.cmp_id = cmp_id;
		this.msg_id = msg_id;
		this.set_message(gmsg);
	}
	
	/**
	 * Gets the component ID of the message.
	 * 
	 * @return the component ID
	 */
	public int get_component_id() {
		return this.cmp_id;
	}
	
	/**
	 * Gets the message ID of the message.
	 * 
	 * @return the message ID
	 */
	public int get_message_id() {
		return this.msg_id;
	}
	
	/**
	 * Gets the size of the message. Will return 0 if no message has been set yet.
	 * 
	 * @return the size of the message
	 */
	public int get_size() {
		return this.size;
	}
	
	/**
	 * Gets the protobuf message as a byte array.
	 * 
	 * @return the protobuf message
	 */
	public byte[] get_message() {
		return this.msg;
	}
	
	/**
	 * Sets the component ID of the message. Pass the same component ID as defined in the
	 * corresponding .proto file of the protobuf message you want to send.
	 * 
	 * @param cmp_id
	 *            the component ID
	 */
	public void set_component_id(int cmp_id) {
		this.cmp_id = cmp_id;
	}
	
	/**
	 * Sets the message ID of the message. Pass the same message ID as defined in the
	 * corresponding .proto file of the protobuf message you want to send.
	 * 
	 * @param msg_id
	 *            the message ID
	 */
	public void set_message_id(int msg_id) {
		this.msg_id = msg_id;
	}
	
	/**
	 * Sets the protobuf message. Pass an instance of the actual protobuf message you want to send.
	 * 
	 * @param gmsg
	 *            the protobuf message, has to extend from GeneratedMessage
	 */
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
	
	/**
	 * Serializes the ProtobufMessage. This method will automatically be called by the
	 * ProtobufClient/ProtobufBroadcastPeer when the message is to be sent out.
	 * 
	 * @return the ByteBuffer containing the ProtobufMessage
	 */
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
