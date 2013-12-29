package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CServerDelete extends Command {

	public CServerDelete(int id) {
		super("serverdelete");
		add(new KeyValueParam("sid", id));
	}

}
