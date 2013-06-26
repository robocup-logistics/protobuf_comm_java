package org.robocup_logistics.llsf_comm;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.channels.UnresolvedAddressException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import org.robocup_logistics.llsf_tools.Key;


import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.GeneratedMessage;

/**
 * The ProtobufBroadcastPeer provides the possibility to communicate with a refbox using broadcast messages.
 * You can send broadcast messages (UDP) by calling the enqueue method. To receive messages, register a
 * ProtobufMessageHandler, incoming messages will be passed to your handler. To send and receive
 * stream messages (TCP), use the ProtobufClient.
 */
public class ProtobufBroadcastPeer {
	
	private DatagramSocket sendsocket;
	private DatagramSocket recvsocket;
	private InetAddress address;
	
	private String hostname;
	private int sendport;
	private int recvport;
	
	private Queue<ProtobufMessage> queue1;
	private Queue<ProtobufMessage> queue2;
	private Queue<ProtobufMessage> act_q;
	private Queue<ProtobufMessage> send_q;
	private SendThread send;
	private RecvThread recv;
	
	private HashMap<Key, GeneratedMessage> msgs = new HashMap<Key, GeneratedMessage>();
	private ProtobufMessageHandler handler;
	
	/**
	 * Instantiates a new ProtobufBroadcastPeer. This method does not connect (see start).
	 * 
	 * @param hostname
	 *            the IP address of the refbox
	 * @param sendport
	 *            the port to which to send
	 * @param recvport
	 * 			  the port to listen on for incoming messages
	 * @see start()
	 */
	public ProtobufBroadcastPeer(String hostname, int sendport, int recvport) {
		this.hostname = hostname;
		this.sendport = sendport;
		this.recvport = recvport;
	}

	/**
	 * Opens the socket to be able to send messages and starts listening on the receive port passed
	 * to the constructor.
	 * 
	 * @throws IOException
	 *             Signals that the connection to the refbox cannot be established.
	 */
	public void start() throws IOException {
		ConThread con = new ConThread();
		con.start();
		try {
			con.join();
			if (con.getException() == null) {
				
				//Initialize Queues
				queue1 = new LinkedList<ProtobufMessage>();
				queue2 = new LinkedList<ProtobufMessage>();
				act_q = queue1;
				send_q = queue2;
				
				//Start Send and Receive Threads
				send = new SendThread();
				send.start();
				recv = new RecvThread();
				recv.start();
				
			} else {
				if (con.getException() instanceof UnknownHostException) {
					throw new UnknownHostException("Don't know about host " + hostname);
				} else if (con.getException() instanceof IOException) {
					throw new IOException("Couldn't get I/O for the connection to " + hostname);
				} else if (con.getException() instanceof UnresolvedAddressException) {
					throw new UnresolvedAddressException();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Stops the ProtobufBroadcastPeer and closes the sockets.
	 */
	public void stop() {
		if (send != null) {
			send.terminate();
		}
		if (recv != null) {
			recv.terminate();
		}
		sendsocket.close();
		recvsocket.close();
	}
	
	/**
	 * Registers a new ProtobufMessageHandler responsible for handling and deserializing incoming
	 * protobuf messages. Required if you want to access received messages. Only allows one registered
	 * handler at the same time.
	 * 
	 * @param handler
	 *            the ProtobufMessageHandler
	 * @see ProtobufMessageHandler
	 */
	public void register_handler(ProtobufMessageHandler handler) {
		this.handler = handler;
	}
	
	/**
	 * Adds and registers a new protobuf message type. This is required to instantiate the correct
	 * protobuf message object when a message is received from the refbox. For example, if you want
	 * the client to be able to receive and process a GameState message, call 
	 * client.<GameState>add_message(GameState.class).
	 * 
	 * @param <T>
	 *            the type of the protobuf message to register, has to extend from GeneratedMessage 
	 * @param c
	 *            the class object of the same protobuf message
	 */
	@SuppressWarnings("unchecked")
	public <T extends GeneratedMessage> void add_message(Class<T> c) {
		try {
			Method m = c.getMethod("getDefaultInstance", (Class<?>[]) null);
			T msg = (T) m.invoke((Object[]) null, (Object[]) null);
			EnumDescriptor desc = msg.getDescriptorForType().findEnumTypeByName("CompType");
			
			int cmp_id = desc.findValueByName("COMP_ID").getNumber();
			int msg_id = desc.findValueByName("MSG_TYPE").getNumber();
			Key key = new Key(cmp_id, msg_id);
			msgs.put(key, msg);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}

	private void handle_message(int cmp_id, int msg_id, ByteBuffer in_msg) {
		if (handler != null) {
			for (Map.Entry<Key, GeneratedMessage> e: msgs.entrySet()) {
				Key key = e.getKey();
				if (key.cmp_id == cmp_id && key.msg_id == msg_id) {
					handler.handle_message(in_msg, e.getValue());
					break;
				}
			}	
		}
	}
	
	/**
	 * Puts a ProtobufMessage into the send queue in order to be sent out to the refbox.
	 * 
	 * @param msg
	 *            the ProtobufMessage to send
	 * @see ProtobufMessage
	 */
	public void enqueue(ProtobufMessage msg) {
		synchronized (act_q) {
			act_q.add(msg);
			try {
				act_q.notifyAll();
			} catch(IllegalMonitorStateException e) {}
		}
	}
	
	private class ConThread extends Thread {
		
		private Exception e = null;
		
		public void run() {
			try {
				sendsocket = new DatagramSocket();
				sendsocket.setBroadcast(true);
				recvsocket = new DatagramSocket(recvport);
				address = InetAddress.getByName(hostname);
	        } catch (UnknownHostException e) {
	        	this.e = e;
	        } catch (IOException e) {
	        	this.e = e;
	        } catch (UnresolvedAddressException e) {
	        	this.e = e;
	        }
		}
		
		public Exception getException() {
			return this.e;
		}
		
	}

	private class SendThread extends Thread {
		
		private boolean run = true;

		public void run() {
			while (run) {
				synchronized (act_q) {
					if (act_q.isEmpty()) {
						try {
							act_q.wait();
							Queue<ProtobufMessage> help_q = send_q;
							send_q = act_q;
							act_q = help_q;
						} catch (InterruptedException e) {}	
					}
				}
				synchronized (send_q) {
					try {
						while (!send_q.isEmpty()) {
							ProtobufMessage msg = send_q.remove();
							byte[] sendData = msg.serialize().array(); 
							DatagramPacket send = new DatagramPacket(sendData, sendData.length, address, sendport);
							sendsocket.send(send);
						}
					} catch (IOException e) {
					}
				}
			}
		}

		public void terminate() {
			this.run = false;
			synchronized(act_q) {
				act_q.notifyAll();	
			}
		}
		
	}

	private class RecvThread extends Thread {
		
		private boolean run = true;

		public void run() {
			while (run) {
				try {
					byte[] receiveData = new byte[recvsocket.getReceiveBufferSize()];
					DatagramPacket receive = new DatagramPacket(receiveData, receiveData.length);
					recvsocket.receive(receive);
					
					byte[] header = new byte[8];
					System.arraycopy(receiveData, 0, header, 0, 8);
					ByteBuffer header_buf = ByteBuffer.wrap(header);
					header_buf.rewind();
					int cmp_id = header_buf.getShort();
					int msg_id = header_buf.getShort();
					int size = header_buf.getInt();
					
					byte[] data = new byte[size];
					System.arraycopy(receiveData, 8, data, 0, size);
					ByteBuffer data_buf = ByteBuffer.wrap(data);
					
					handle_message(cmp_id, msg_id, (ByteBuffer) data_buf.rewind());
				} catch (IOException e) {
				}
			}
		}

		public void terminate() {
			this.run = false;
		}
		
	}
	
}
