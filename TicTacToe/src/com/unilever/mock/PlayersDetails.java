package com.unilever.mock;

import java.util.List;

public class PlayersDetails {
	private List<PlayerDetail> playerDetail;

	public List<PlayerDetail> getPlayerDetail() {
		return playerDetail;
	}

	public void setPlayerDetail(List<PlayerDetail> playerDetail) {
		this.playerDetail = playerDetail;
	}

	@Override
	public String toString() {
		return "ClassPojo [playerDetail = " + playerDetail + "]";
	}
}