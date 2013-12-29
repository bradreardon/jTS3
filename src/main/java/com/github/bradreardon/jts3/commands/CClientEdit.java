package com.github.bradreardon.jts3.commands;

import java.util.HashMap;

import com.github.bradreardon.jts3.api.ClientProperty;
import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CClientEdit extends Command{

	public CClientEdit(int clientId, HashMap<ClientProperty, String> options) {
		super("clientedit");
		add(new KeyValueParam("clid",clientId+""));
		if (options != null) {
			for (ClientProperty p : options.keySet()) {
				if (p.isChangeable()) {
					add(new KeyValueParam(p.getName(), options.get(p)));
				}
			}
		}
	}

}
