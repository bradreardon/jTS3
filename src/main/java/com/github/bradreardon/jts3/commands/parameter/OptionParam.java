package com.github.bradreardon.jts3.commands.parameter;

import com.github.bradreardon.jts3.StringUtil;

public class OptionParam extends Parameter {

	private String option;

	public OptionParam(String option) {
		this.option=option;
	}

	public String build() {
		return "-"+StringUtil.encode(option);
	}

}
