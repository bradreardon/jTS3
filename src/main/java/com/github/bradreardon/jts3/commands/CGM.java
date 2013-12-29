package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CGM extends Command {

	public CGM(String message) {
		super("gm");
		add(new KeyValueParam("msg", message));
	}

}
