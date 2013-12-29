package com.github.bradreardon.jts3.commands.parameter;

import java.util.ArrayList;
import java.util.List;

public class ArrayParameter extends Parameter {

	private List<Parameter> parameters = new ArrayList();
	
	public ArrayParameter() {
	}

	public ArrayParameter(Parameter... parameters) {
		for(Parameter p: parameters){
			this.parameters.add(p);
		}
	}
	
	public ArrayParameter add(Parameter p){
		parameters.add(p);
		return this;
	}

	public String build() {
		String str = "";
		for (int i = 0; i < parameters.size(); i++) {
			str += parameters.get(i).build();
			if (i < parameters.size() - 1) {
				str += "|";
			}
		}
		return str;
	}

}
