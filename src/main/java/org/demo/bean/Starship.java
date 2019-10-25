package org.demo.bean;

import javax.inject.Inject;

public class Starship { // We want to test this!

	@Inject
	private Engine engine;

	public void start() {
		System.out.println("Starship : starting...");
		engine.start();
		System.out.println("Starship : started.");
	}
}
