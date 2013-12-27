package org.infiniteroot.dices.randomengine;

/**
 * Random Engine interface to generate random dice faces
 * 
 * @author logoff
 * 
 */
public interface RandomEngine {

	/**
	 * Generates a random face given the number of faces
	 * 
	 * @param faces
	 *            number of dice faces
	 * @return random generated face
	 */
	public int getFace(int faces);

	/**
	 * Generates the result of rolling a number of dices using
	 * {@link #getFace(int)} method
	 * 
	 * @param faces
	 *            number of dice faces
	 * @param dices
	 *            number of dices to roll
	 * @return result of adding each one of the rolled dice faces
	 */
	public int result(int faces, int dices);
	
}
