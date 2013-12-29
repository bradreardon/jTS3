package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CPrivilegeKeyUse extends Command{

	public CPrivilegeKeyUse(String token) {
		super("privilegekeyuse");
		add(new KeyValueParam("token",token));
	}

}
