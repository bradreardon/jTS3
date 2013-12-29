package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CClientPoke extends Command {

	public CClientPoke(int clientId, String message) {
		super("clientpoke");
		add(new KeyValueParam("clid", clientId));
		add(new KeyValueParam("msg", message));
	}

}
