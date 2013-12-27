package org.infiniteroot.dices.randomengine;

public class BasicRandomEngineImpl implements RandomEngine {

	public int getFace(int faces) {
		return ((int) (Math.random() * Integer.MAX_VALUE) % faces) + 1;
	}

	public int result(int faces, int dices) {
		return getFace(faces) * dices;
	}
}
