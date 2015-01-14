package com.teste.junit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.teste.match.Match;

public class ScoreBoardTest {
	
	Match match = new Match();
	
	@Test
	public void checkIfDontHaveScoreBoardTest() throws InterruptedException{
		
		match.preparingPlayers();
		
		assertTrue(match.getScoreBoard().getDeath().size()==0);
		assertTrue(match.getScoreBoard().getMurder().size()==0);
		
	}
	@Test
	public void checkIfHaveScoreBoardTest() throws InterruptedException{
		
		match.preparingPlayers();
		match.turn();
		match.turn();
		match.turn();
		match.turn();
		
		assertTrue(match.getScoreBoard().getDeath().size()>0);
		assertTrue(match.getScoreBoard().getMurder().size()>0);
		
	}
}
