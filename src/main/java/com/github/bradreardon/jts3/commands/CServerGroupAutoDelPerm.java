package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.api.ServerGroupType;
import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CServerGroupAutoDelPerm extends Command {

	public CServerGroupAutoDelPerm(ServerGroupType t, String permName) {
		super("servergroupautodelperm");
		add(new KeyValueParam("sgtype", t.getIndex()));
		add(new KeyValueParam("permsid", permName));
	}

}
