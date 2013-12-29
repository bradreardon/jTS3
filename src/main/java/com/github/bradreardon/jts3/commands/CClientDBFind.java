package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;
import com.github.bradreardon.jts3.commands.parameter.OptionParam;

public class CClientDBFind extends Command {

	public CClientDBFind(String pattern, boolean uid) {
		super("clientdbfind");
		add(new KeyValueParam("pattern", pattern));
		if (uid) {
			add(new OptionParam("uid"));
		}
	}

}
