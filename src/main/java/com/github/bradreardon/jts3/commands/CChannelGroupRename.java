package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CChannelGroupRename extends Command {

	public CChannelGroupRename(int groupId, String name) {
		super("channelgrouprename");
		add(new KeyValueParam("cgid", groupId));
		add(new KeyValueParam("name", name));
	}

}
