package com.github.bradreardon.jts3.commands;

import java.util.HashMap;

import com.github.bradreardon.jts3.api.VirtualServerProperty;
import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CServerCreate extends Command {

	public CServerCreate(String name, HashMap<VirtualServerProperty, String> map) {
		super("servercreate");
		add(new KeyValueParam(
				VirtualServerProperty.VIRTUALSERVER_NAME.getName(), name));
		if (map != null) {
			for (VirtualServerProperty p : map.keySet()) {
				add(new KeyValueParam(p.getName(), map.get(p)));
			}
		}

	}

}
