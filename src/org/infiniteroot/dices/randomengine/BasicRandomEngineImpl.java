package org.infiniteroot.dices.randomengine;

public class RandomEngine {

	public static int getFace(int faces){
		return ((int)(Math.random()*Integer.MAX_VALUE) % faces) + 1;
	}
	
	public static int result(int faces, int dices){
		return getFace(faces)*dices;
	}
}
