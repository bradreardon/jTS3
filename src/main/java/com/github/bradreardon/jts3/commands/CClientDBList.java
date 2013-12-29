package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.KeyValueParam;
import com.github.bradreardon.jts3.commands.parameter.OptionParam;

public class CClientDBList extends Command{

	public CClientDBList(int begin, int amount, boolean count) {
		super("clientdblist");
		add(new KeyValueParam("start", begin+""));
		add(new KeyValueParam("duration", amount+""));
		if(count){
			add(new OptionParam("count"));
		}
		
	}

}
