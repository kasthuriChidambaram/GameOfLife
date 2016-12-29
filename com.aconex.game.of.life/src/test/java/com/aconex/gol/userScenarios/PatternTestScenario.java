package com.aconex.gol.userScenarios;

import org.junit.Test;

import com.aconex.game.of.life.GameOfLifePattern;

public class PatternTestScenario extends AbstractScenario {

	@Test
	public void golHappyPath() throws Exception{
		GameOfLifePattern gol=new GameOfLifePattern(getDriver());
		gol.varyMatrixSize(1,3);
		gol.patternGenerator();
		
		
	}
}
