package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CChannelDelPerm extends Command {

	public CChannelDelPerm(int channelId, String permName) {
		super("channeldelperm");
		add(new KeyValueParam("cid",channelId));
		add(new KeyValueParam("permsid",permName));
	}

}
