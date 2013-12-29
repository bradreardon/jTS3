package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CClientInfo extends Command {

	public CClientInfo(int clientId) {
		super("clientinfo");
		add(new KeyValueParam("clid", clientId));
	}

}
