package com.unilever.view;

public interface TicTacToeView {
	
	
	public String matrixSize();
	
	public int noOfplayers();
	
	public String getPlayerIdentifier(int playerNumber);
	
	public String getPlayerName(int playerNumber);
	
	public void printResult(String message,String value);

	public void playerTurn(String playerName);

	public Integer playerXCoOrdinate(String xCoordinate,String PlayerName, Integer position);

	public Integer playerYCoOrdinate(String yCoordinate,String PlayerName, Integer position);
	
	public void printResult(String message);
}
