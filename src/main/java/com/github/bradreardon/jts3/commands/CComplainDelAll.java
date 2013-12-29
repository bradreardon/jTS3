package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CComplainDelAll extends Command {

	public CComplainDelAll(int clientDBId) {
		super("complaindelall");
		add(new KeyValueParam("tcldbid",clientDBId+""));
	}

}
