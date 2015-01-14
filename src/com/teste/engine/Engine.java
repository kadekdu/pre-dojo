package com.teste.engine;

import com.teste.match.Match;

/**
 * @author Carlos Eduardo Pieroni
 * 
 *         This class is a engine for the test is run. The game time is 2
 *         minutes and each turn is 1 second. On final of the match, the
 *         scoreBoard is printed on console.
 * 
 * */
public class Engine {

	public static void main(String[] args) throws InterruptedException {

		Match match = new Match();
		long t0 = System.currentTimeMillis();
		long time = 120000;
		while (true) {
			if ((System.currentTimeMillis() - t0 > time)) {
				break;
			}
			match.turn();
			match.preparingPlayers();
			Thread.sleep(1000);

		}

		match.scoreBoard();
	}

}
