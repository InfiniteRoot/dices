package org.infiniteroot.dices.model;

/**
 * Dice model class.<br />
 * A dice is defined by the number of faces it has.
 * 
 * @author logoff
 * 
 */
public class Dice {

	private int faces;

	public Dice(int faces) {
		this.faces = faces;
	}

	public int getFaces() {
		return faces;
	}
}
