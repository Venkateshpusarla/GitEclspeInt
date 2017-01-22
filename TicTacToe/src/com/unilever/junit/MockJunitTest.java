package com.unilever.junit;

import org.junit.Test;

import com.unilever.view.TicTacToeGame;

public class MockJunitTest {

	@Test
	public void mockTest(){
		TicTacToeGame ticTacToeGame = new TicTacToeGame();
		ticTacToeGame.start();
	}
}
