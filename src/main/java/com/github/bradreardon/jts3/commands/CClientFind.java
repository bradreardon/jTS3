package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CClientFind extends Command{

	public CClientFind(String pattern) {
		super("clientfind");
		add(new KeyValueParam("pattern",pattern));
	}

}
