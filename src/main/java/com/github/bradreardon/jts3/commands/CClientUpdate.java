package com.github.bradreardon.jts3.commands;

import java.util.HashMap;

import com.github.bradreardon.jts3.api.ClientProperty;
import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CClientUpdate extends Command{

	public CClientUpdate(HashMap<ClientProperty, String> options) {
		super("clientupdate");
		if (options != null) {
			for (ClientProperty p : options.keySet()) {
				if (p.isChangeable()) {
					add(new KeyValueParam(p.getName(), options.get(p)));
				}
			}
		}
	}

}
