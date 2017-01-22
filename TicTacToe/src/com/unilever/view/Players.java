package com.unilever.view;

public class Players {
	private String playername;
	private String playerSignature;
	
	
	public Players(String playername, String playerSignature) {
		this.playername = playername;
		this.playerSignature = playerSignature;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public String getPlayerSignagure() {
		return playerSignature;
	}
	public void setPlayerSignagure(String playerSignagure) {
		this.playerSignature = playerSignagure;
	}
	@Override
	public String toString() {
		return "Players [playername=" + playername + ", playerSignature=" + playerSignature + "]";
	}
	
	

}
