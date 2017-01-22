package com.unilever.view;

import com.unilever.mock.MockDataFromXML;


public class TicTacToeMockView implements TicTacToeView, Constants {

	private String mockSize;

	public TicTacToeMockView(String mockSize) {
		this.mockSize = mockSize;
	}

	@Override
	public String matrixSize() {
		MockDataFromXML cToObject = new MockDataFromXML();
		return cToObject.getMatrixSize(mockSize);
	}

	@Override
	public int noOfplayers() {
		MockDataFromXML cToObject = new MockDataFromXML();
		return Integer.parseInt(cToObject.getNoOfPlayers(mockSize));
	}

	@Override
	public String getPlayerIdentifier(int playerNumber) {
		MockDataFromXML cToObject = new MockDataFromXML();
		return cToObject.getPlayerSymbol(mockSize, playerNumber - 1);
	}

	@Override
	public String getPlayerName(int playerNumber) {
			MockDataFromXML cToObject = new MockDataFromXML();
		return cToObject.getPlayerName(mockSize, playerNumber - 1);
	}

	@Override
	public void printResult(String message, String value) {
		System.out.println(message + " " + value);
	}

	@Override
	public void playerTurn(String playerName) {
		System.out.println(playerName + "TURN");
	}

	@Override
	public Integer playerXCoOrdinate(String xCoordinate, String playerName, Integer position) {
		MockDataFromXML cToObject = new MockDataFromXML();
		return Integer.parseInt(cToObject.getCoordinatesByPosition(xCoordinate, playerName, position, mockSize));
	}

	@Override
	public Integer playerYCoOrdinate(String yCoordinate, String playerName, Integer position) {
		MockDataFromXML cToObject = new MockDataFromXML();
		return Integer.parseInt(cToObject.getCoordinatesByPosition(yCoordinate, playerName, position, mockSize));
	}
	
	@Override
	public void printResult(String message) {
		System.out.println(message);
	}

}
