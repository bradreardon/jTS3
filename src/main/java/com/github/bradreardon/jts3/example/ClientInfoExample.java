package com.github.bradreardon.jts3.example;

import com.github.bradreardon.jts3.TS3Api;
import com.github.bradreardon.jts3.TS3Query;
import com.github.bradreardon.jts3.TS3Query.FloodRate;
import com.github.bradreardon.jts3.api.wrapper.Client;

public class ClientInfoExample {

	public static void main(String[] args) {
		new ClientInfoExample();
	}

	public ClientInfoExample() {
		TS3Api api = new TS3Query("77.77.77.77", TS3Query.DEFAULT_PORT,
				FloodRate.DEFAULT).connect().getApi();

		api.login("serveradmin", "serveradminpassword");
		api.selectVirtualServerById(1);
		api.setNickname("PutPutBot");

		for (Client c : api.getClients()) {
			System.out.println(c.getNickname() + " in channel: "
					+ api.getChannelInfo(c.getChannelId()).getName());
		}
	}

}
