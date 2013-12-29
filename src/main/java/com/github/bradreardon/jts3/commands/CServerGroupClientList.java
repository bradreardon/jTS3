package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;
import com.github.bradreardon.jts3.commands.parameter.OptionParam;

public class CServerGroupClientList extends Command {

	public CServerGroupClientList(int groupId) {
		super("servergroupclientlist");
		add(new KeyValueParam("sgid",groupId+""));
		add(new OptionParam("names"));
	}

}
