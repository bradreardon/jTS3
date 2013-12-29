package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CServerIdGetByPort extends Command {

	public CServerIdGetByPort(int port) {
		super("serveridgetbyport");
		add(new KeyValueParam("virtualserver_port", port));
	}

}
