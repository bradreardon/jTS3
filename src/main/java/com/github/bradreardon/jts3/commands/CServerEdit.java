package com.github.bradreardon.jts3.commands;

import java.util.HashMap;

import com.github.bradreardon.jts3.api.VirtualServerProperty;
import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CServerEdit extends Command{

	public CServerEdit(HashMap<VirtualServerProperty, String> map) {
		super("serveredit");
		for (VirtualServerProperty p : map.keySet()) {
			add(new KeyValueParam(p.getName(), map.get(p)));
		}
	}

}
