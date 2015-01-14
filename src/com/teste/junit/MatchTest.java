package com.teste.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.teste.match.Match;

public class MatchTest {
	Match match = new Match();

	@Test
	public void checkAllPlayerHaveWeaponTest() {
		match.preparingPlayers();

		assertNotNull(match.getPlayer().get(0).getWeapon());
		assertNotNull(match.getPlayer().get(1).getWeapon());
		assertNotNull(match.getPlayer().get(2).getWeapon());
		assertNotNull(match.getPlayer().get(3).getWeapon());
		assertNotNull(match.getPlayer().get(4).getWeapon());

	}
	
	@Test
	public void checkOnePlayerNotHaveWeaponTest() {
		match.preparingPlayers();
		match.getPlayer().get(2).setWeapon(null);
		
		assertNotNull(match.getPlayer().get(0).getWeapon());
		assertNotNull(match.getPlayer().get(1).getWeapon());
		assertNull(match.getPlayer().get(2).getWeapon());
		assertNotNull(match.getPlayer().get(3).getWeapon());
		assertNotNull(match.getPlayer().get(4).getWeapon());

	}
	
	@Test
	public void checkAllPlayerNotHaveWeaponTest() {
		match.preparingPlayers();
		match.getPlayer().get(0).setWeapon(null);
		match.getPlayer().get(1).setWeapon(null);
		match.getPlayer().get(2).setWeapon(null);
		match.getPlayer().get(3).setWeapon(null);
		match.getPlayer().get(4).setWeapon(null);
		
		assertNull(match.getPlayer().get(0).getWeapon());
		assertNull(match.getPlayer().get(1).getWeapon());
		assertNull(match.getPlayer().get(2).getWeapon());
		assertNull(match.getPlayer().get(3).getWeapon());
		assertNull(match.getPlayer().get(4).getWeapon());

	}
	
	

}
