package com.unilever.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;

public class TicTacToeGame implements Constants {

	private TicTacToeView tacToeView = new  TicTacToeMockView("3");

	private Integer boardSize;

	private List<Players> playersList = new ArrayList<Players>();

	private HashMap<String, String> playerMap = new HashMap<String, String>();

	public void start() {
		Integer totalmove = 1;
		Coordinate cordinate;
		Winner winner = new Winner();
		winner.setIsGaveOver(false);
		Boolean validMove = false;
		String matrixSize = tacToeView.matrixSize();
		TicTacToeBoard board1 = null;
		try {
			boardSize = TicTacToeBoard.validateDimension(matrixSize);
		} catch (Exception e) {
			tacToeView.printResult("", e.getMessage());
			start();
		}
		board1 = new TicTacToeBoard(boardSize);
		board1.displayMatrix(boardSize);

		int noOfPlayers = validateNoOfPlayers();
		for (int payer = 0; payer < noOfPlayers; payer++) {
			try {
				playersList = initializePlayers(payer);
			} catch (Exception ex) {
				tacToeView.getPlayerIdentifier(payer);
			}
		}
		Integer totalBoardSize = boardSize * boardSize;
		while (totalmove <= totalBoardSize && !winner.getIsGaveOver()) {
			for (Players players : playersList) {
				while (!validMove && !winner.getIsGaveOver()
						&& totalmove <= totalBoardSize) {
					tacToeView.playerTurn(players.getPlayername());
					Integer xAxis = tacToeView.playerXCoOrdinate(X_COORDINATE,
							players.getPlayername(), totalmove);
					Integer yAxis = tacToeView.playerYCoOrdinate(Y_COORDINATE,
							players.getPlayername(), totalmove);
					cordinate = new Coordinate(xAxis, yAxis);
					if (board1.isValidCoordinate(cordinate)) {
						validMove = board1.isValidCoordinate(cordinate);
						validMove = board1.move(players, cordinate);
						winner = board1.findWinner();
						totalmove++;
					} else {
						tacToeView.printResult("", Invalid_CoOrdinate);
					}
				}
				board1.drawBoard();
				if (winner.getIsGaveOver()) {
					break;
				}
				validMove = false;
			}
		}
		if (winner.getIsGaveOver()) {
			tacToeView.printResult(winner.getPlayerOwn().getPlayername(), WON);
		} else {
			tacToeView.printResult("", MATCH_DRAW);
		}
	}

	public Integer validateNoOfPlayers() {
		Integer noOfplayers = null;
		try {
			noOfplayers = parseInt();
			while (noOfplayers < 2) {
				tacToeView.printResult("No Of Players: ", Maximum_Players);
				noOfplayers = parseInt();
			}
		} catch (Exception e) {
			tacToeView.printResult("", Valid_Player);
		}
		return noOfplayers;
	}

	public List<Players> initializePlayers(Integer payer) throws Exception {
		String playerIdentifier = tacToeView.getPlayerIdentifier(payer + 1);
		if (!playerMap.isEmpty() && playerMap.containsKey(playerIdentifier)) {
			tacToeView.printResult(Duplicate_Symbol, "");
			playerIdentifier = tacToeView.getPlayerIdentifier(payer + 1);
		}
		String playerName = tacToeView.getPlayerName(payer + 1);
		playerMap.put(playerIdentifier, playerName);
		Players players = new Players(playerName, playerIdentifier);
		playersList.add(players);
		return playersList;
	}

	private Integer parseInt() throws InputMismatchException {
		Integer noOfPlyers = tacToeView.noOfplayers();
		return noOfPlyers;
	}
}
