package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CMessageGet extends Command {

	public CMessageGet(int messageId) {
		super("messageget");
		add(new KeyValueParam("msgid",messageId+""));
	}

}
