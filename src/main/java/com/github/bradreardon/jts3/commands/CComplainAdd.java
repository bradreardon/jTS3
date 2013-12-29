package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CComplainAdd extends Command {

	public CComplainAdd(int clientDBId, String text) {
		super("complainadd");
		add(new KeyValueParam("tcldbid", clientDBId));
		add(new KeyValueParam("message", text));
	}

}
