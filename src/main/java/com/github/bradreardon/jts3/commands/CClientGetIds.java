package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CClientGetIds extends Command{

	public CClientGetIds(String clientUId) {
		super("clientgetids");
		add(new KeyValueParam("cluid",clientUId));
	}

}
