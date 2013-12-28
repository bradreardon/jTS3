package com.github.theholywaffle.teamspeak3.commands.response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

import com.github.theholywaffle.teamspeak3.StringUtil;

public class DefaultArrayResponse{

	private final List<HashMap<String, String>> array = new ArrayList();


	public DefaultArrayResponse(String raw) {
		StringTokenizer tkn = new StringTokenizer(raw, "|", false);
		
		while (tkn.hasMoreTokens()) {
			array.add(parse(tkn.nextToken()));
		}
	}
	
	private HashMap<String, String> parse(String raw){
		StringTokenizer st = new StringTokenizer(raw, " ", false);
		HashMap<String, String> options = new HashMap();

		while (st.hasMoreTokens()) {
			String tmp = st.nextToken();
			int pos = tmp.indexOf("=");

			if (pos == -1) {
				options.put(tmp, "");
			} else {
				options.put(StringUtil.decode(tmp.substring(0, pos)),
						StringUtil.decode(tmp.substring(pos + 1)));
			}
		}
		return options;
	}
	
	public List<HashMap<String, String>> getArray(){
		return array;
	}
	
	public String toString(){
		String str = "";
		for(HashMap<String, String> opt : array){
			str+=opt+" | ";
		}
		return str;
	}

}
