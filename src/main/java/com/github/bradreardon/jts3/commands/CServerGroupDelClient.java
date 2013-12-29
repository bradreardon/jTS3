package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CServerGroupDelClient extends Command {

	public CServerGroupDelClient(int groupId, int clientDBId) {
		super("servergroupdelclient");
		add(new KeyValueParam("sgid", groupId));
		add(new KeyValueParam("cldbid", clientDBId));
	}

}
