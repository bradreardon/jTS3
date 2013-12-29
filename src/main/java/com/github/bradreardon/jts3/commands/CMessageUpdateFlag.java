package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CMessageUpdateFlag extends Command {

	public CMessageUpdateFlag(int messageId, boolean read) {
		super("messageupdateflag");
		add(new KeyValueParam("msgid", messageId));
		add(new KeyValueParam("flag", read ? "1" : "0"));
	}

}
