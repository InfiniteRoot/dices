package org.infiniteroot.dices.model;

import java.util.Set;

/**
 * Game defined by a name and a {@link Set} of {@link Dice}'s
 * 
 * @author logoff
 * 
 */
public class Game {

	private String name;
	private Set<Dice> dicesSet;

	public Game(String name, Set<Dice> dicesSet) {
		this.name = name;
		this.dicesSet = dicesSet;
	}

	public String getName() {
		return name;
	}

	public Set<Dice> getDicesSet() {
		return dicesSet;
	}

	/**
	 * Returns game's name
	 */
	@Override
	public String toString() {
		return name;
	}

}
