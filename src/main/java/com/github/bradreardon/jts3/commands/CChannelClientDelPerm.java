package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CChannelClientDelPerm extends Command{

	public CChannelClientDelPerm(int channelId, int clientDBId, String permName) {
		super("channelclientdelperm");
		add(new KeyValueParam("cid",channelId));
		add(new KeyValueParam("cldbid",clientDBId));
		add(new KeyValueParam("permsid",permName));
	}

}
