package org.demo;

import org.demo.bean.Starship;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Main {

	public static void main(String[] args) {
		Weld weld = new Weld();
		WeldContainer container = weld.initialize();
		
		System.out.println("Main START");
		Starship starship = container.select(Starship.class).get();
		starship.start();
		System.out.println("sleep...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("sleep interrupted");
		}
		System.out.println("Main STOP");
		
		System.out.println("Weld container shutdown...");
		container.shutdown();
	}

}
