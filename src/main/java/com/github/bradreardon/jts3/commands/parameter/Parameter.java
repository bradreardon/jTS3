package com.github.bradreardon.jts3.commands.parameter;

public abstract class Parameter {
	
	public abstract String build();
	
	public String toString(){
		return build();
	}

}
