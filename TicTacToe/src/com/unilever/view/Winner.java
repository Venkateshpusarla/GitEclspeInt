package com.unilever.view;

public class Winner {
	
	private Boolean isGaveOver;
	private Players playerOwn;
	public Boolean getIsGaveOver() {
		return isGaveOver;
	}
	public void setIsGaveOver(Boolean isGaveOver) {
		this.isGaveOver = isGaveOver;
	}
	public Players getPlayerOwn() {
		return playerOwn;
	}
	public void setPlayerOwn(Players playerOwn) {
		this.playerOwn = playerOwn;
	}
	
	@Override
	public String toString() {
		return "Winner [isGaveOver=" + isGaveOver + ", playerOwn=" + playerOwn + "]";
	}
	@Override
	public boolean equals(Object obj) {
		boolean eq;
		Winner winner = new Winner();
		winner = (Winner)obj;
		if(this.isGaveOver== winner.isGaveOver && this.playerOwn.getPlayername().equalsIgnoreCase(winner.playerOwn.getPlayername()) &&
				this.playerOwn.getPlayerSignagure().equalsIgnoreCase(winner.playerOwn.getPlayerSignagure())){
			eq = true;
		}else{
			eq = false;

		}
		return eq;
	}
	
	
	
}
