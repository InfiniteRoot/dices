package org.infiniteroot.dices.application;

import org.infiniteroot.dices.randomengine.BasicRandomEngineImpl;
import org.infiniteroot.dices.randomengine.RandomEngine;

import android.app.Application;

public class DicesApp extends Application {
	public RandomEngine randomEngine;

	@Override
	public void onCreate() {
		super.onCreate();
		this.randomEngine = new BasicRandomEngineImpl();
	}
	
}
