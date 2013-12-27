package org.infiniteroot.dices.model;

/**
 * {@link Dice} with a graphical texture associated
 * 
 * @author logoff
 * 
 */
public class GraphicalDice extends Dice {

	private String textureFile;

	public GraphicalDice(int faces, String textureFile) {
		super(faces);
		this.textureFile = textureFile;
	}

	public String getTextureFile() {
		return textureFile;
	}

}
