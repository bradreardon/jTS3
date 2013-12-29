package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.api.PermissionGroupDatabaseType;
import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CServerGroupAdd extends Command {

	public CServerGroupAdd(String name) {
		this(name, PermissionGroupDatabaseType.REGULAR);
	}

	public CServerGroupAdd(String name, PermissionGroupDatabaseType t) {
		super("servergroupadd");
		add(new KeyValueParam("name", name));
		add(new KeyValueParam("type", t.getIndex()));
	}

}
