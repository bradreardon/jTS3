package com.github.bradreardon.jts3.api.event;

import java.util.HashMap;

import com.github.bradreardon.jts3.api.wrapper.Wrapper;

public class ChannelEditedEvent extends Wrapper implements TS3Event,
		TS3EventEmitter {

	public ChannelEditedEvent() {
		super(null);
	}

	public ChannelEditedEvent(HashMap<String, String> map) {
		super(map);
	}

	public int getChannelId() {
		return getInt("cid");
	}
	
	public int getReasonId() {
		return getInt("reasonid");
	}
	
	public int getInvokerId() {
		return getInt("invokerid");
	}
	
	public String getInvokerName(){
		return get("invokername");
	}
	
	public String getInvokerUniqueId(){
		return get("invokeruid");
	}

	public void fire(TS3Listener listener, HashMap<String, String> map) {
		listener.onChannelEdit(new ChannelEditedEvent(map));
	}

}
