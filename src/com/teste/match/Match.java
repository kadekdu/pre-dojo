package com.teste.match;

import java.util.ArrayList;
import java.util.Random;

import com.teste.player.Player;
import com.teste.score.ScoreBoard;
import com.teste.weapon.Weapon;

public class Match {
	private ArrayList<Player> player;
	private ArrayList<Weapon> weapon;
	private long idMatch = 0;
	private ScoreBoard scoreBoard;

	public Match() {
		idMatch = (new Double(Math.random())).longValue();
		System.out.println("New match " + idMatch + " has started");
		System.out.println("Creating the players...");
		setPlayer(new ArrayList<Player>());
		addPlayer("Roman");
		addPlayer("Nick");
		addPlayer("Josh");
		addPlayer("Jay");
		addPlayer("<WORLD>");
		System.out.println("Creating the weapon...");
		setWeapon(new ArrayList<Weapon>());
		addWeapon("AK47");
		addWeapon("DROWN");
		addWeapon("M16");
		addWeapon("Pistol");
		System.out.println("Preparing the players...");
		preparingPlayers();
		System.out.println("Players setup!");
		System.out.println("Initializating match.");
		setScoreBoard(new ScoreBoard());

	}

	public void preparingPlayers() {
		Random random = new Random();
		for (Player player : getPlayer()) {
			if (player != null) {
				int weaponId = random.nextInt(3);
				Weapon weapon = getWeapon().get(weaponId);

				player.setWeapon(weapon);
			}
		}
	}

	public void turn() throws InterruptedException {
		Random random = new Random();

		Player killer = getPlayer().get(random.nextInt(getPlayer().size()));
		Player killed = getPlayer().get(random.nextInt(getPlayer().size()));
		if (killer.equals(killed)) {
			return;
		}
		if (killer.getName().equals("<WORLD>")
				&& killer.getWeapon().getWeapon().equals("DROWN")) {
			return;
		}
		Integer death = new Integer(0);
		Integer murder = new Integer(0);
		if (getScoreBoard().getDeath().size() > 0
				&& getScoreBoard().getDeath().get(killed) != null) {
			death = new Integer(getScoreBoard().getDeath().get(killed)
					.intValue() + 1);
		}
		if (getScoreBoard().getMurder().size() > 0
				&& getScoreBoard().getMurder().get(killer) != null) {
			murder = new Integer(getScoreBoard().getMurder().get(killer)
					.intValue() + 1);
		}
		getScoreBoard().getDeath().put(killed, death);
		getScoreBoard().getMurder().put(killer, murder);

	}

	public void scoreBoard() {
		getScoreBoard().rankingDeath();
		getScoreBoard().rankingMurder();
	}

	public ArrayList<Player> getPlayer() {
		return player;
	}

	public void setPlayer(ArrayList<Player> player) {
		this.player = player;
	}

	public void addPlayer(String name) {
		Player player = new Player();
		player.setName(name);
		getPlayer().add(player);

	}

	public ArrayList<Weapon> getWeapon() {
		return weapon;
	}

	public void setWeapon(ArrayList<Weapon> weapon) {
		this.weapon = weapon;
	}

	public void addWeapon(String name) {
		Weapon weapon = new Weapon();
		weapon.setWeapon(name);
		getWeapon().add(weapon);
	}

	public ScoreBoard getScoreBoard() {
		return scoreBoard;
	}

	public void setScoreBoard(ScoreBoard scoreBoard) {
		this.scoreBoard = scoreBoard;
	}

}
