package com.unilever.view;


import junit.framework.Assert;

import org.junit.Test;

public class TicTacToeGameTest {

	@Test
	public void testStart() {
		TicTacToeGame ticTacToeGame = new TicTacToeGame();
		ticTacToeGame.start();
	}

	@Test
	public void testValidateNoOfPlayers() {
		TicTacToeGame ticTacToeGame = new TicTacToeGame();
		Assert.assertEquals((Integer)2, ticTacToeGame.validateNoOfPlayers());
	}


}
