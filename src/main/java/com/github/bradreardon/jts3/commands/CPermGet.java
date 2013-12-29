package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CPermGet extends Command{

	public CPermGet(String permName) {
		super("permget");
		add(new KeyValueParam("permsid",permName));
	}

}
