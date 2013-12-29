package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CClientSetServerQueryLogin extends Command {

	public CClientSetServerQueryLogin(String username) {
		super("clientsetserverquerylogin");
		add(new KeyValueParam("client_login_name",username));
	}



}
