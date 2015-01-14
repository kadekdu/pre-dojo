package com.teste.player;

import com.teste.weapon.Weapon;

public class Player  {
	private String name;
	private Weapon weapon;
	
	public Weapon getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
