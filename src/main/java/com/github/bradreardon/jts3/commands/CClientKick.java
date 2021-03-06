package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.api.ReasonIdentifier;
import com.github.bradreardon.jts3.commands.parameter.ArrayParameter;
import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;

public class CClientKick extends Command {

	public CClientKick( ReasonIdentifier reason, String reasonMessage,int... clientIds) {
		super("clientkick");
		ArrayParameter p = new ArrayParameter();
		for(int id : clientIds){
			p.add(new KeyValueParam("clid",id+""));
		}
		add(p);
		add(new KeyValueParam("reasonid",reason.getIndex()+""));
		if(reasonMessage != null){
			add(new KeyValueParam("reasonmsg",reasonMessage));
		}		
	}

}
