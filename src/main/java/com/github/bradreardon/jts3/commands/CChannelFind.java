package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CChannelFind extends Command {

	public CChannelFind(String pattern) {
		super("channelfind");
		add(new KeyValueParam("pattern",pattern));
	}

}
