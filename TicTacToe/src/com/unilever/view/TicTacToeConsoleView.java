package com.unilever.view;

import java.util.Scanner;

public class TicTacToeConsoleView implements TicTacToeView {

	private Scanner scanner = null;

	public TicTacToeConsoleView() {
		scanner = new Scanner(System.in);
	}

	@Override
	public String matrixSize() {
		System.out.println("Please Enter the Matrix size");
		String matrixSize = scanner.next();
		return matrixSize;
	}
	
	@Override
	public String getPlayerIdentifier(int playerNumber) {
		System.out.println("Please Enter Player "+playerNumber+" Symbol ");
		return scanner.next();
	}
	
	@Override
	public int noOfplayers() {
		System.out.println("Please Enter the No Of players ");
		return scanner.nextInt();
	}
	
	@Override
	public String getPlayerName(int playerNumber) {
		System.out.println("Please Enter Player "+playerNumber+" Name ");
		return scanner.next();
	}
	
	@Override
	public void printResult(String message,String value) {
		System.out.println(message+""+value);
	}
	
	@Override
	public void playerTurn(String playerName) {
		System.out.println(playerName +" "+ "TURN ");
	}
	
	@Override
	public Integer playerXCoOrdinate(String xCoordinate,String PlayerName, Integer position) {
		System.out.println(" Please Enter "+xCoordinate+" CoOrdinate ");
		return scanner.nextInt();
	}
	
	@Override
	public Integer playerYCoOrdinate(String yCoordinate,String PlayerName, Integer position) {
		System.out.println("position on Y"+position);
		System.out.println(" Please Enter "+yCoordinate+" CoOrdinate ");
		return scanner.nextInt();
	}
	@Override
	public void printResult(String message) {
		System.out.println(message);
	}
	
//	private char gameBoard[][] = null;
//
//	@Override
//	public void displayBoard() {
//		System.out.println("Please Enter the Matrix size");
//		String matrixSize = scanner.next();
//		if (matrixSize.matches("\\d\\/?\\d+")) {
//			String[] matrixSplit = matrixSize.split("/");
//			if (matrixSplit[0].equalsIgnoreCase(matrixSplit[1])) {
//				gameBoard = new char[Integer.parseInt(matrixSplit[0])][Integer
//						.parseInt(matrixSplit[1])];
//				matrixNumber = matrixSplit[0];
//				displayMatrix(matrixSize, gameBoard);
//			} else {
//				System.out
//						.println("Matrix should be N*N Please try again (Y/N) ");
//				if (scanner.next().equalsIgnoreCase("Y")) {
//					displayBoard();
//				}
//			}
//		} else {
//			System.out.println(Invalid_Matrix_Size);
//			if (scanner.next().equalsIgnoreCase("Y")) {
//				displayBoard();
//			}
//		}
//	}
//
//	public List<Player> getPlayerDetails() {
//		System.out.println("Please enter no Of players");
//		int noOfPlayers = scanner.nextInt();
//		for(int player =1; player<=noOfPlayers;player++){
//			System.out.println("Please Player "+player +"  Name ");
//			String playerName = scanner.next();
//			Player player1 = new Player();
//			player1.setName(playerName);
//			System.out.println("Please Player "+player +"  Symbol ");
//			String playerIdentifier = scanner.next();
//			player1.setIdentifier(playerIdentifier);
//			playerList.add(player1);
//		}
//		
//		return playerList;
//	}
//	
//	public void choosePosition(){
//		Board board = new Board(Integer.parseInt(matrixNumber), gameBoard);
//		
//		board.askPlayerToMove('X', 1, 1);
//		
//	}
//	
//	
//	
//	
//
//	private void displayMatrix(String matrixSize, char gameBoard[][]) {
//		for (int row = 0; row < matrixSize.length(); row++) {
//			for (int col = 0; col < gameBoard[0].length; col++) {
//				System.out.print("\t" + gameBoard[row][col]);
//				if (col == 0 || col == 1) {
//					System.out.print("|");
//				}
//			}
//			if (row == 0 || row == 1) {
//				System.out.print("\n----------------------------\n");
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//		TicTacToeConsoleView consoleView = new TicTacToeConsoleView();
//		consoleView.displayBoard();
//		System.out.println("\n");
//		List<Player> playerList = consoleView.getPlayerDetails();
//		System.out.println("playerList"+playerList);
//		
//		consoleView.choosePosition();
//	}
//
//	public int getNoOfpalyer() {
//		return noOfpalyer;
//	}
//
//	public void setNoOfpalyer(int noOfpalyer) {
//		this.noOfpalyer = noOfpalyer;
//	}
//
//	public List<Player> getPlayerList() {
//		return playerList;
//	}
//
//	public void setPlayerList(List<Player> playerList) {
//		this.playerList = playerList;
//	}

	
}
