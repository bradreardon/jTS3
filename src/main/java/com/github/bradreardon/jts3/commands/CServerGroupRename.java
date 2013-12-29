package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CServerGroupRename extends Command {

	public CServerGroupRename(int id, String name) {
		super("servergrouprename");
		add(new KeyValueParam("sgid", id));
		add(new KeyValueParam("name", name));
	}

}
