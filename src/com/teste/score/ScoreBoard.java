package com.teste.score;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.teste.player.Player;
import com.teste.util.ComparatorInteger;

public class ScoreBoard {

	private HashMap<Player, Integer> death;
	private HashMap<Player, Integer> murder;

	public ScoreBoard() {
		this.death = new HashMap<Player, Integer>();
		this.murder = new HashMap<Player, Integer>();
	}

	public HashMap<Player, Integer> getDeath() {
		return death;
	}

	public void setDeath(HashMap<Player, Integer> death) {
		this.death = death;
	}

	public HashMap<Player, Integer> getMurder() {
		return murder;
	}

	public void setMurder(HashMap<Player, Integer> murder) {
		this.murder = murder;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void rankingDeath() {
		ComparatorInteger compInteger = new ComparatorInteger(getDeath());

		Map<Player, Integer> mapaOrdenado = new TreeMap(compInteger);
		mapaOrdenado.putAll(getDeath());

		for (Player key : mapaOrdenado.keySet()) {
			System.out.println(key.getName() + " player died "
					+ getDeath().get(key) + " times");
		}

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void rankingMurder() {

		ComparatorInteger compInteger = new ComparatorInteger(getMurder());

		Map<Player, Integer> mapaOrdenado = new TreeMap(compInteger);
		mapaOrdenado.putAll(getMurder());

		for (Player key : mapaOrdenado.keySet()) {
			System.out.println(key.getName() + " murdered "
					+ getMurder().get(key) + " times");
		}

	}

}
