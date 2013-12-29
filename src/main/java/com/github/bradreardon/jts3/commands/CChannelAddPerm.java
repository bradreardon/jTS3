package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CChannelAddPerm extends Command {

	public CChannelAddPerm(int channelid, String permName, int permValue) {
		super("channeladdperm");
		add(new KeyValueParam("cid", channelid));
		add(new KeyValueParam("permsid", permName));
		add(new KeyValueParam("permvalue", permValue));
	}

}
