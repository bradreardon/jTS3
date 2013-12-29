package com.github.bradreardon.jts3.api.event;

import java.util.HashMap;

import com.github.bradreardon.jts3.api.TextMessageTargetMode;
import com.github.bradreardon.jts3.api.wrapper.Wrapper;

public class TextMessageEvent extends Wrapper implements TS3Event,
		TS3EventEmitter {

	public TextMessageEvent(HashMap<String, String> map) {
		super(map);
	}

	public TextMessageEvent() {
		super(null);
	}

	public TextMessageTargetMode getTargetMode() {
		for (TextMessageTargetMode m : TextMessageTargetMode.values()) {
			if (m.getIndex() == getInt("targetmode")) {
				return m;
			}
		}
		return null;
	}

	public String getMessage() {
		return get("msg");
	}

	public int getInvokerId() {
		return getInt("invokerid");
	}

	public String getInvokerName() {
		return get("invokername");
	}

	public String getInvokerUserId() {
		return get("invokeruid");
	}

	public void fire(TS3Listener listener, HashMap<String, String> map) {
		listener.onTextMessage(new TextMessageEvent(map));
	}

}
