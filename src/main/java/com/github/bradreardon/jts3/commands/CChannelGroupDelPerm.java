package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CChannelGroupDelPerm extends Command{

	public CChannelGroupDelPerm(int groupId, String permName) {
		super("channelgroupdelperm");
		add(new KeyValueParam("cgid",groupId+""));
		add(new KeyValueParam("permsid",permName));
	}

}
