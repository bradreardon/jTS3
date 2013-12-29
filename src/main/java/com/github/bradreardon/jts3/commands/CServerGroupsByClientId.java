package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CServerGroupsByClientId extends Command{

	public CServerGroupsByClientId(int clientDBId) {
		super("servergroupsbyclientid");
		add(new KeyValueParam("cldbid", clientDBId+""));
	}

}
