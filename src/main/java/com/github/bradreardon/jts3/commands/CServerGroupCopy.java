package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.api.PermissionGroupDatabaseType;
import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CServerGroupCopy extends Command {

	public CServerGroupCopy(int sourceId, int targetId, String targetName,
			PermissionGroupDatabaseType t) {
		super("servergroupcopy");
		add(new KeyValueParam("ssgid", sourceId));
		add(new KeyValueParam("tsgid", targetId));
		add(new KeyValueParam("name", targetName));
		add(new KeyValueParam("type", t.getIndex()));
	}

}
