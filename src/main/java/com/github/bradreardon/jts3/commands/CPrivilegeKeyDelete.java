package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CPrivilegeKeyDelete extends Command {

	public CPrivilegeKeyDelete(String token) {
		super("privilegekeydelete");
		add(new KeyValueParam("token",token));
	}

}
