package com.teste.util;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import com.teste.player.Player;

public class ComparatorInteger implements Comparator<Player> {

	Map<Player, Integer> base;

	public ComparatorInteger(HashMap<Player, Integer> hashMap) {
		this.base = hashMap;
	}

	@Override
	public int compare(Player o1, Player o2) {
		 return base.get(o1).compareTo(base.get(o2));
	}

}
