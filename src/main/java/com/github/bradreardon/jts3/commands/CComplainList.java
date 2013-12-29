package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CComplainList extends Command {

	public CComplainList(int clientDBId) {
		super("complainlist");
		if(clientDBId> 0){
			add(new KeyValueParam("tcldbid",clientDBId+""));
		}		
	}

}
