package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CClientDBInfo extends Command {

	public CClientDBInfo(int clientDBId) {
		super("clientdbinfo");
		add(new KeyValueParam("cldbid",clientDBId+""));
	}

}
