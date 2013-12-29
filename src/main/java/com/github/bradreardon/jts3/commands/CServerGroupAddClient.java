package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CServerGroupAddClient extends Command {

	public CServerGroupAddClient(int groupId, int clientDBId) {
		super("servergroupaddclient");
		add(new KeyValueParam("sgid", groupId));
		add(new KeyValueParam("cldbid", clientDBId));
	}

}
