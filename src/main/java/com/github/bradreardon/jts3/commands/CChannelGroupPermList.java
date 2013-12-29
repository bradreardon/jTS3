package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;
import com.github.bradreardon.jts3.commands.parameter.OptionParam;

public class CChannelGroupPermList extends Command{

	public CChannelGroupPermList(int groupId) {
		super("channelgrouppermlist");
		add(new KeyValueParam("cgid",groupId+""));
		add(new OptionParam("permsid"));
	}

}
