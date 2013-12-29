package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CBanDel extends Command{

	public CBanDel(int banId) {
		super("bandel");
		add(new KeyValueParam("banid",banId));
	}

}
