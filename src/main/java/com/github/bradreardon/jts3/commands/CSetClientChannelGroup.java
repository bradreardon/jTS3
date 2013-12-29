package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CSetClientChannelGroup extends Command{

	public CSetClientChannelGroup(int groupId, int channelId, int clientDBId) {
		super("setclientchannelgroup");
		add(new KeyValueParam("cgid",groupId+""));
		add(new KeyValueParam("cid",channelId+""));
		add(new KeyValueParam("cldbid",clientDBId+""));
	}

}
