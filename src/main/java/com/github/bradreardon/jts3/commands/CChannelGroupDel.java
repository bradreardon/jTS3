package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CChannelGroupDel extends Command {

	public CChannelGroupDel(int channelGroupId, boolean forced) {
		super("channelgroupdel");
		add(new KeyValueParam("cgid",channelGroupId+""));
		add(new KeyValueParam("force", forced?"1":"0"));
	}

}
