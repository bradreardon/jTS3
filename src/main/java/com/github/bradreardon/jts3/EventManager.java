package com.github.bradreardon.jts3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.bradreardon.jts3.api.event.ChannelDescriptionEditedEvent;
import com.github.bradreardon.jts3.api.event.ChannelEditedEvent;
import com.github.bradreardon.jts3.api.event.ClientJoinEvent;
import com.github.bradreardon.jts3.api.event.ClientLeaveEvent;
import com.github.bradreardon.jts3.api.event.ClientMovedEvent;
import com.github.bradreardon.jts3.api.event.ServerEditedEvent;
import com.github.bradreardon.jts3.api.event.TS3EventEmitter;
import com.github.bradreardon.jts3.api.event.TS3Listener;
import com.github.bradreardon.jts3.api.event.TextMessageEvent;
import com.github.bradreardon.jts3.api.exception.UnknownEventException;
import com.github.bradreardon.jts3.commands.response.DefaultArrayResponse;

public class EventManager {

	private Map<String, TS3EventEmitter> map = new HashMap();

	private List<TS3Listener> listeners = new ArrayList();

	public EventManager() {
		map.put("notifytextmessage", new TextMessageEvent());
		map.put("notifycliententerview", new ClientJoinEvent());
		map.put("notifyclientleftview", new ClientLeaveEvent());
		map.put("notifyserveredited", new ServerEditedEvent());
		map.put("notifychanneledited", new ChannelEditedEvent());
		map.put("notifychanneldescriptionchanged",
				new ChannelDescriptionEditedEvent());
		map.put("notifyclientmoved", new ClientMovedEvent());
	}

	public void addListeners(TS3Listener... listeners) {
		for (TS3Listener l : listeners) {
			this.listeners.add(l);
		}
	}

	public void removeListeners(TS3Listener... listeners) {
		for (TS3Listener l : listeners) {
			this.listeners.remove(l);
		}
	}

	public void fireEvent(String notifyName, String notifyBody) {
		TS3EventEmitter emitter = map.get(notifyName);
		if (emitter != null) {
			for (TS3Listener l : listeners) {
				emitter.fire(l, new DefaultArrayResponse(notifyBody).getArray()
						.get(0));
			}
		} else {
			throw new UnknownEventException(notifyName + " " + notifyBody);
		}

	}

}
