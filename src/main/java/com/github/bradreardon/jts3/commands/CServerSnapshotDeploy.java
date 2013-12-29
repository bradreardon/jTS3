package com.github.bradreardon.jts3.commands;

import com.github.bradreardon.jts3.commands.parameter.RawParam;

public class CServerSnapshotDeploy extends Command {

	public CServerSnapshotDeploy(String snapshot) {
		super("serversnapshotdeploy");
		add(new RawParam(snapshot));
	}

}
