package com.unilever.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.unilever.view.Coordinate;
import com.unilever.view.Players;
import com.unilever.view.TicTacToeBoard;
import com.unilever.view.Winner;
	
public class GameTest {
	
	@Test
	public void TestJunit(){
		
		TicTacToeBoard board1 = new TicTacToeBoard(3);
		Players player1 = new Players("Venky", "X");
		board1.move(player1, new Coordinate(0, 0));
		board1.move(player1, new Coordinate(1, 1));
		board1.move(player1, new Coordinate(2, 2));
//		board1.displayMatrix(3);
		Winner winner = new Winner();
		winner.setIsGaveOver(true);
		winner.setPlayerOwn(player1);
		assertEquals(winner, board1.diagonalWinnerSearch());
		

		TicTacToeBoard board2 = new TicTacToeBoard(3);
		Players player2 = new Players("Ram", "0");
		board2.move(player2, new Coordinate(0, 2));
		board2.move(player2, new Coordinate(1, 1));
		board2.move(player2, new Coordinate(2, 0));
		Winner winner2 = new Winner();
		winner2.setIsGaveOver(true);
		winner2.setPlayerOwn(player2);
		assertEquals(winner2, board2.diagonalWinnerSearch());
//		
//		
		TicTacToeBoard board3 = new TicTacToeBoard(3);
		Players player3 = new Players("Venky", "X");
		board3.move(player3, new Coordinate(0, 0));
		board3.move(player3, new Coordinate(1, 0));
		board3.move(player3, new Coordinate(2, 0));
		Winner winner3 = new Winner();
		winner3.setIsGaveOver(true);
		winner3.setPlayerOwn(player3);
		assertEquals(winner3, board3.columnWiseWinnerSearch());
//		
//		
		TicTacToeBoard board4 = new TicTacToeBoard(3);
		Players player4 = new Players("Venky", "X");
		board4.move(player4, new Coordinate(0, 1));
		board4.move(player4, new Coordinate(1, 1));
		board4.move(player4, new Coordinate(2, 1));
		Winner winner4 = new Winner();
		winner4.setIsGaveOver(true);
		winner4.setPlayerOwn(player4);
		assertEquals(winner4, board4.columnWiseWinnerSearch());
//		
		TicTacToeBoard board5 = new TicTacToeBoard(3);
		Players player5 = new Players("Venky", "X");
		board5.move(player5, new Coordinate(0, 1));
		board5.move(player5, new Coordinate(1, 1));
		board5.move(player5, new Coordinate(2, 1));
		Winner winner5 = new Winner();
		winner5.setIsGaveOver(true);
		winner5.setPlayerOwn(player5);
		assertEquals(winner5, board5.columnWiseWinnerSearch());
//		
//		
		TicTacToeBoard board6 = new TicTacToeBoard(3);
		Players player6 = new Players("Venky", "X");
		board6.move(player6, new Coordinate(0, 0));
		board6.move(player6, new Coordinate(0, 1));
		board6.move(player6, new Coordinate(0, 2));
		Winner winner6 = new Winner();
		winner6.setIsGaveOver(true);
		winner6.setPlayerOwn(player6);
		assertEquals(winner6, board6.rowWiseWinnerSearch());
//		
//		
		TicTacToeBoard board7 = new TicTacToeBoard(3);
		Players player7 = new Players("venky", "X");
		board7.move(player7, new Coordinate(1, 0));
		board7.move(player7, new Coordinate(1, 1));
		board7.move(player7, new Coordinate(1, 2));
		Winner winner7 = new Winner();
		winner7.setIsGaveOver(true);
		winner7.setPlayerOwn(player7);
		assertEquals(winner7, board7.rowWiseWinnerSearch());
//		
//		
		TicTacToeBoard board8 = new TicTacToeBoard(3);
		Players player8 = new Players("Venky", "X");
		board8.move(player8, new Coordinate(2, 0));
		board8.move(player8, new Coordinate(2, 1));
		board8.move(player8, new Coordinate(2, 2));
		Winner winner8 = new Winner();
		winner8.setIsGaveOver(true);
		winner8.setPlayerOwn(player8);
		assertEquals(winner8, board8.rowWiseWinnerSearch());
		
//		
		TicTacToeBoard board9 = new TicTacToeBoard(3);
		Players player91 = new Players("Rohit", "X");
		Players player92 = new Players("Ram", "X");
		board9.move(player91, new Coordinate(2, 0));
		board9.move(player92, new Coordinate(0, 0));
//		
		board9.move(player91, new Coordinate(2, 1));
		board9.move(player92, new Coordinate(1, 1));

		board9.move(player91, new Coordinate(2, 2));
		board9.move(player92, new Coordinate(0, 2));
		
		Winner winner91 = new Winner();
		winner91.setIsGaveOver(true);
		winner91.setPlayerOwn(player91);
		assertEquals(winner91, board9.rowWiseWinnerSearch());
		
		
		TicTacToeBoard board10 = new TicTacToeBoard(3);
		Coordinate coordinate = new Coordinate(1, 1);
		assertEquals(true, board10.isValidCoordinate(coordinate));
		
		
		TicTacToeBoard board11 = new TicTacToeBoard(3);
		Coordinate coordinate111 = new Coordinate(8, 9);
		assertEquals(false, board11.isValidCoordinate(coordinate111));
		
		
		TicTacToeBoard board12 = new TicTacToeBoard(3);
		Players player12 = new Players("Venky", "X");
		board12.move(player12, new Coordinate(2, 0));
		board12.move(player12, new Coordinate(2, 1));
		board12.move(player12, new Coordinate(2, 2));
		assertEquals(false, board12.move(player12, new Coordinate(2, 0)));
//		
//		
//		TicTacToeGame ticTacToeGame = new TicTacToeGame();
//		ticTacToeGame.start();

	}

	
	
	
}
