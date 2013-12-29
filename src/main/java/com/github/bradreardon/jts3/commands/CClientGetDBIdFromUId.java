package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CClientGetDBIdFromUId extends Command{

	public CClientGetDBIdFromUId(String clientUId) {
		super("clientgetdbidfromuid");
		add(new KeyValueParam("cluid",clientUId));
	}

}
