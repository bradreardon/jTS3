package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CServerStart extends Command{

	public CServerStart(int id) {
		super("serverstart");
		add(new KeyValueParam("sid",id+""));
	}

}
