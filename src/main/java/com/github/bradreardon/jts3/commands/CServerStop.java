package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CServerStop extends Command {

	public CServerStop(int id) {
		super("serverstop");
		add(new KeyValueParam("sid", id));
	}
}
