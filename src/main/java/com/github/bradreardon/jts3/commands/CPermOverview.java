package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CPermOverview extends Command {

	public CPermOverview(int channelId, int clientDBId) {
		super("permoverview");
		add(new KeyValueParam("cid",channelId+""));
		add(new KeyValueParam("cldbid",clientDBId+""));
		add(new KeyValueParam("permid",0+""));
	}

}
