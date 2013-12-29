package com.github.bradreardon.jts3.api.wrapper;

import java.util.HashMap;

public class Binding extends Wrapper {

	public Binding(HashMap<String, String> map) {
		super(map);
	}
	
	public String getIp(){
		return get("ip");
	}

}
