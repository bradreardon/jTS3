package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CPermFind extends Command{

	public CPermFind(String permName) {
		super("permfind");
		add(new KeyValueParam("permsid",permName));
	}

}
