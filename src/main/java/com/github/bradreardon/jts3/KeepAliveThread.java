package com.github.bradreardon.jts3;

import com.github.bradreardon.jts3.commands.CWhoAmI;

public class KeepAliveThread extends Thread{
	
	private static final int SLEEP = 60000;

	private TS3Query ts3;
	private SocketWriter writer;

	public KeepAliveThread(TS3Query ts3, SocketWriter socketWriter) {
		this.ts3=ts3;
		this.writer=socketWriter;
	}
	
	public void run(){
		while (ts3.getSocket().isConnected() && ts3.getIn() != null) {
			long idleTime = writer.getIdleTime();
			if(idleTime >= SLEEP){
				ts3.doCommand(new CWhoAmI());
				try {
					Thread.sleep(SLEEP);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}			
			}else{
				try {
					Thread.sleep(SLEEP - idleTime);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		TS3Query.log.severe("KeepAlive thread is having problems!");
	}

}
