package com.github.bradreardon.jts3.commands.parameter;

import com.github.bradreardon.jts3.StringUtil;

public class ValueParam extends Parameter {
	
	private String value;

	public ValueParam(String value){
		this.value=value;
	}

	public String build() {
		return StringUtil.encode(value);
	}

}
