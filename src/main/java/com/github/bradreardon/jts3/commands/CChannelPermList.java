package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;
import com.github.bradreardon.jts3.commands.parameter.OptionParam;


public class CChannelPermList extends Command {

	public CChannelPermList(int channelId) {
		super("channelpermlist");
		add(new KeyValueParam("cid",channelId+""));
		add(new OptionParam("permsid"));
	}

	



}
