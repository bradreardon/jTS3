package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;
import com.github.bradreardon.jts3.commands.parameter.OptionParam;

public class CServerGroupPermList extends Command {

	public CServerGroupPermList(int id) {
		super("servergrouppermlist");
		add(new KeyValueParam("sgid", id));
		add(new OptionParam("permsid"));
	}

}
