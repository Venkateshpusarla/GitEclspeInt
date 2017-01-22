package com.unilever.mock;

public class PlayerDetail {
	private String playerSymbol;

	private String playerName;

	public String getPlayerSymbol() {
		return playerSymbol;
	}

	public void setPlayerSymbol(String playerSymbol) {
		this.playerSymbol = playerSymbol;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	@Override
	public String toString() {
		return "ClassPojo [playerSymbol = " + playerSymbol + ", playerName = " + playerName + "]";
	}
}