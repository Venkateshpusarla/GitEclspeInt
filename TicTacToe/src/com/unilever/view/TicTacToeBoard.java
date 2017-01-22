package com.unilever.view;

public class TicTacToeBoard implements Constants {
	public Players[][] board;
	private Integer boardSize;
	private TicTacToeView ticTacToeView = new TicTacToeConsoleView();

	public TicTacToeBoard(Integer bordSize) {
		this.boardSize = bordSize;
		this.board = new Players[bordSize][bordSize];
	}
	
	
	
	
	public static Integer validateDimension(String matrixSize) throws Exception {
		if (matrixSize.matches("\\d\\/?\\d+")) {
			String[] matrixSplit = matrixSize.split(Split_Seperator);
			if (matrixSplit[0].equalsIgnoreCase(matrixSplit[1])) {
				Integer boardSize = Integer.parseInt(matrixSplit[1]);
				return boardSize;
			} else {
				throw new Exception(
						"Please Enter The Valid Matrix Size should be N*N ");
			}
		} else {
			throw new Exception("Matrix Size Should be Integers eg 3/3");
		}

	}

	

	public Boolean move(Players player, Coordinate cordinate) {
		Boolean isValidMove = false;

		if (cordinate.getxAxis() < this.boardSize
				|| cordinate.getyAxis() < this.boardSize) {
			if (this.board[cordinate.getxAxis()][cordinate.getyAxis()] == null
					&& isValidCoordinate(cordinate)) {
				this.board[cordinate.getxAxis()][cordinate.getyAxis()] = player;
				isValidMove = true;
			} else {
				isValidMove = false;
			}
		} else {
			isValidMove = false;
		}
		return isValidMove;
	}

	public Boolean isValidCoordinate(Coordinate cordinate) {
		Boolean isValid = false;
		if (cordinate != null && cordinate.getxAxis() >= 0
				&& cordinate.getxAxis() < this.boardSize
				&& cordinate.getyAxis() >= 0
				&& cordinate.getyAxis() < this.boardSize) {
			isValid = true;
			if (this.board[cordinate.getxAxis()][cordinate.getyAxis()] != null) {
				isValid = false;
			}
		} else {
			isValid = false;

		}
		return isValid;
	}

	public void drawBoard() {

		for (int i = 0; i < this.boardSize; i++) {
			for (int horizontalLine = 0; horizontalLine < (this.boardSize + 1) * 5; horizontalLine++) {
				System.out.print(".");
			}
			System.out.println();
			for (int verticalLine = 0; verticalLine <= this.boardSize; verticalLine++) {
				System.out.print("|     ");
			}
			System.out.println();
			for (int verticalLine = 0; verticalLine < this.boardSize; verticalLine++) {
				System.out.print("|  ");
				if (i < this.boardSize && this.board[i][verticalLine] != null) {
					System.out.print(this.board[i][verticalLine]
							.getPlayerSignagure() + "  ");
				} else {
					System.out.print("   ");

				}
			}
			System.out.print("|");

			System.out.println();
			for (int verticalLine = 0; verticalLine <= this.boardSize; verticalLine++) {
				System.out.print("|     ");
			}
			System.out.println();

		}
		for (int horizontalLine = 0; horizontalLine < (this.boardSize + 1) * 5; horizontalLine++) {
			System.out.print(".");
		}
		System.out.println();
	}

	public Winner findWinner() {
		Winner winner = new Winner();
		winner.setIsGaveOver(false);
		winner = this.rowWiseWinnerSearch();
		if (winner.getIsGaveOver()) {
			return winner;
		}
		winner = this.columnWiseWinnerSearch();
		if (winner.getIsGaveOver()) {
			return winner;
		}
		winner = this.diagonalWinnerSearch();
		if (winner.getIsGaveOver()) {
			return winner;
		}
		return winner;
	}

	public Winner rowWiseWinnerSearch() {
		Winner winner = new Winner();
		Players player = null;
		Boolean won = false;
		winner.setIsGaveOver(won);
		for (int x = 0; x < this.boardSize; x++) {
			won = true;
			if (this.board[x][0] != null) {
				player = this.board[x][0];
				for (int y = 1; y < this.boardSize; y++) {
					if ((this.board[x][y] != null && this.board[x][y] != player)
							|| this.board[x][y] == null) {
						won = false;
					}
				}
				if (won) {
					winner.setIsGaveOver(true);
					winner.setPlayerOwn(player);
					return winner;
				} else {
					winner.setIsGaveOver(false);
				}
			} else {
				won = false;
			}
		}

		return winner;
	}

	public Winner columnWiseWinnerSearch() {
		Winner winner = new Winner();
		Players player = null;
		Boolean won = false;
		winner.setIsGaveOver(won);
		for (int y = 0; y < this.boardSize; y++) {
			won = true;
			if (this.board[0][y] != null) {
				player = this.board[0][y];
				for (int x = 1; x < this.boardSize; x++) {
					if ((this.board[x][y] != null && this.board[x][y] != player)
							|| this.board[x][y] == null) {
						won = false;
					}
				}
				if (won) {
					winner.setIsGaveOver(true);
					winner.setPlayerOwn(player);
					return winner;
				} else {
					winner.setIsGaveOver(false);
				}
			} else {
				won = false;
				winner.setIsGaveOver(false);
			}
		}

		return winner;
	}

	public Winner diagonalWinnerSearch() {
		Winner winner = new Winner();
		Players player = null;
		Boolean won = false;
		int xAxis = 0;
		int yAxis = 0;
		if (this.board[0][0] != null) {
			won = true;
			player = this.board[0][0];
			while (xAxis < this.boardSize && yAxis < this.boardSize) {
				if (this.board[xAxis][yAxis] != player) {
					won = false;
				}
				xAxis++;
				yAxis++;
			}

			if (won) {
				winner.setIsGaveOver(won);
				winner.setPlayerOwn(player);
				return winner;
			} else {
				winner.setIsGaveOver(false);
			}
		} else {
			won = false;
			winner.setIsGaveOver(false);
		}
		xAxis = 0;
		yAxis = this.boardSize - 1;
		if (this.board[xAxis][yAxis] != null) {
			won = true;
			player = this.board[xAxis][yAxis];
			while (xAxis < this.boardSize && yAxis >= 0) {
				if (this.board[xAxis][yAxis] != player) {
					won = false;
				}
				yAxis--;
				xAxis++;
			}

			if (won) {
				winner.setIsGaveOver(won);
				winner.setPlayerOwn(player);
				return winner;
			} else {
				winner.setIsGaveOver(false);
			}
		} else {
			won = false;
			winner.setIsGaveOver(false);
		}
		return winner;
	}
	
	public void displayMatrix(Integer matrixSize) {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				if (col <= board.length) {
					System.out.print("  | ");
				}
			}
			if (row <= board.length) {
				System.out.print("\n----------------\n");
			}
		}
		System.out.println();
	}

}
