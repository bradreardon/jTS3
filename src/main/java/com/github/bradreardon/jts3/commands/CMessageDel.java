package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CMessageDel extends Command{

	public CMessageDel(int messageId) {
		super("messagedel");
		add(new KeyValueParam("msgid",messageId+""));
	}

}
