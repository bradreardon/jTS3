package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CMessageAdd extends Command {

	public CMessageAdd(String clientUId, String subject, String message) {
		super("messageadd");
		add(new KeyValueParam("cluid",clientUId));
		add(new KeyValueParam("subject",subject));
		add(new KeyValueParam("message",message));
	}

}
