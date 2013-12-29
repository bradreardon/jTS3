package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CPermIdGetByName extends Command{

	public CPermIdGetByName(String permName) {
		super("permidgetbyname");
		add(new KeyValueParam("permsid",permName));
	}

}
