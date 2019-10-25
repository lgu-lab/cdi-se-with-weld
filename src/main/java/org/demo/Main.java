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
		System.out.println("Main STOP");
		
		container.shutdown();
	}

}
