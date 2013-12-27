package org.infiniteroot.dices.model;

import java.util.Map;

/**
 * {@link Dice} with a symbol associated to each face
 * 
 * @author logoff
 * 
 */
public class TextDice extends Dice {

	private Map<Integer, String> symbolMap;
	
	public TextDice(int faces, Map<Integer, String> symbolMap) {
		super(faces);
		this.symbolMap = symbolMap;
	}

	public String getSymbol(int face) {
		return symbolMap.get(face);
	}
	
}
