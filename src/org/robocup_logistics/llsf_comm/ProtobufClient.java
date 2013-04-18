package org.robocup_logistics.llsf_comm;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.channels.UnresolvedAddressException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import org.robocup_logistics.llsf_tools.Key;


import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.GeneratedMessage;

public class ProtobufClient {
	
	private String hostname;
	private int port;
	private SocketChannel sockchan;
	
	private Queue<ProtobufMessage> queue1;
	private Queue<ProtobufMessage> queue2;
	private Queue<ProtobufMessage> act_q;
	private Queue<ProtobufMessage> send_q;
	private ConThread con;
	private SendThread send;
	private RecvThread recv;
	
	private HashMap<Key, GeneratedMessage> msgs = new HashMap<Key, GeneratedMessage>();
	private ProtobufMessageHandler handler;
	
	public ProtobufClient(String hostname, int port) {
		this.hostname = hostname;
		this.port = port;
	}

	public void connect() throws IOException {
		con = new ConThread();
		con.start();
		try {
			con.join(); //Wait for Connection Thread to succeed
			if (con.getException() == null) { //there was no Exception
				
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
		} catch (InterruptedException e) {}
	}
	
	public void disconnect() {
		try {
			send.terminate();
			recv.terminate();
			sockchan.close();
		} catch (IOException e) {}
	}
	
	public void register_handler(ProtobufMessageHandler handler) {
		this.handler = handler;
	}
	
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
	
	public void handle_message(int cmp_id, int msg_id, ByteBuffer in_msg) {
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
	
	public void enqueue(ProtobufMessage msg) {
		synchronized (act_q) {
			act_q.add(msg);
			try {
				act_q.notifyAll();
			} catch(IllegalMonitorStateException e) {}
		}
	}
	
	public synchronized void enqueue_and_wait(ProtobufMessage msg) {
		synchronized (act_q) {
			act_q.add(msg);
			act_q.notifyAll();	
		}
		try {
			this.wait();	
		} catch (InterruptedException e) {}
	}
	
	public synchronized void wake() {
		notifyAll();
	}
	
	private class ConThread extends Thread {
		
		private Exception e = null;
		
		public void run() {
			try {
				sockchan = SocketChannel.open();
				sockchan.connect(new InetSocketAddress(hostname, port));
				sockchan.finishConnect();
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
	
	public class SendThread extends Thread {
		
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
							sockchan.write(msg.serialize());
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
	
	public class RecvThread extends Thread {
		
		private boolean run = true;
		
		public void run() {
			while (run) {
				try {
					
					//Header einlesen
					ByteBuffer in_header = ByteBuffer.allocate(8);
					sockchan.read(in_header);
					in_header.rewind();
					
					//Payload einlesen
					int cid = in_header.getShort();
					int msgid = in_header.getShort();
					ByteBuffer in_msg = ByteBuffer.allocate(in_header.getInt());
					while (in_msg.remaining() != 0) {
						sockchan.read(in_msg);
					}
					
					handle_message(cid, msgid, (ByteBuffer) in_msg.rewind());
				} catch (IOException e) {
				}
			}
		}
		
		public void terminate() {
			this.run = false;
		}
		
	}
	
}
