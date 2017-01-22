package com.unilever.view;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class TicTacToeBoardTest {
	
	TicTacToeBoard tictacboeBoard = new TicTacToeBoard(3);


	@Test
	public void testMove() {
		Players player = new Players("Venky", "X");
		assertEquals(true, tictacboeBoard.move(player, new Coordinate(0, 0)));
		assertEquals(true, tictacboeBoard.move(player, new Coordinate(0, 1)));
		assertEquals(true, tictacboeBoard.move(player, new Coordinate(0, 2)));
		assertEquals(true, tictacboeBoard.move(player, new Coordinate(1, 0)));
		assertEquals(true, tictacboeBoard.move(player, new Coordinate(1, 1)));
		assertEquals(true, tictacboeBoard.move(player, new Coordinate(1, 2)));
		assertEquals(true, tictacboeBoard.move(player, new Coordinate(2, 0)));
		assertEquals(true, tictacboeBoard.move(player, new Coordinate(2, 1)));
		assertEquals(true, tictacboeBoard.move(player, new Coordinate(2, 2)));
	}

	@Test
	public void testIsValidCoordinate() {
		assertEquals(true, tictacboeBoard.isValidCoordinate(new Coordinate(0, 0)));
		assertEquals(true, tictacboeBoard.isValidCoordinate(new Coordinate(0, 1)));
		assertEquals(true, tictacboeBoard.isValidCoordinate(new Coordinate(0, 2)));
		assertEquals(true, tictacboeBoard.isValidCoordinate(new Coordinate(1, 0)));
		assertEquals(true, tictacboeBoard.isValidCoordinate(new Coordinate(1, 1)));
		assertEquals(true, tictacboeBoard.isValidCoordinate(new Coordinate(1, 2)));
		assertEquals(true, tictacboeBoard.isValidCoordinate(new Coordinate(2, 0)));
		assertEquals(true, tictacboeBoard.isValidCoordinate(new Coordinate(2, 1)));
		assertEquals(true, tictacboeBoard.isValidCoordinate(new Coordinate(2, 2)));
	}

	@Test
	public void testFindWinner() {
		Winner winner = new Winner();
		winner.setIsGaveOver(true);
		Players player = new Players("Venky", "X");
		winner.setPlayerOwn(player);
		tictacboeBoard.move(player, new Coordinate(0, 0));
		tictacboeBoard.move(player, new Coordinate(1, 1));
		tictacboeBoard.move(player, new Coordinate(2, 2));
		assertEquals(winner, tictacboeBoard.findWinner());
	}

	@Test
	public void testRowWiseWinnerSearch() {
		Winner winner = new Winner();
		winner.setIsGaveOver(true);
		Players player = new Players("Ram", "O");
		winner.setPlayerOwn(player);
		tictacboeBoard.move(player, new Coordinate(0, 0));
		tictacboeBoard.move(player, new Coordinate(0, 1));
		tictacboeBoard.move(player, new Coordinate(0, 2));
		assertEquals(winner, tictacboeBoard.rowWiseWinnerSearch());
	}

	@Test
	public void testColumnWiseWinnerSearch() {
		Winner winner = new Winner();
		winner.setIsGaveOver(true);
		Players player = new Players("Raja", "*");
		winner.setPlayerOwn(player);
		tictacboeBoard.move(player, new Coordinate(0, 0));
		tictacboeBoard.move(player, new Coordinate(1, 0));
		tictacboeBoard.move(player, new Coordinate(2, 0));
		assertEquals(winner, tictacboeBoard.columnWiseWinnerSearch());
	}

	@Test
	public void testDiagonalWinnerSearch() {
		Winner winner = new Winner();
		winner.setIsGaveOver(true);
		Players player = new Players("Raja", "*");
		winner.setPlayerOwn(player);
		tictacboeBoard.move(player, new Coordinate(0, 0));
		tictacboeBoard.move(player, new Coordinate(1, 1));
		tictacboeBoard.move(player, new Coordinate(2, 2));
		assertEquals(winner, tictacboeBoard.diagonalWinnerSearch());
	}

}
