package com.unilever.junit;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.unilever.view.TicTacToeBoardTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   GameTest.class,
   MockJunitTest.class,
   TicTacToeBoardTest.class,
})
public class JunitTestSuite {

}
