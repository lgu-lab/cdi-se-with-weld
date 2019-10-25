package org.demo.bean;

import javax.inject.Inject;

import org.demo.bean.sub.SubEngine1;
import org.demo.bean.sub.SubEngine2;

public class Engine {

	@Inject
	private SubEngine1 subengine1;

	@Inject
	private SubEngine2 subengine2;

	public void start() {
		System.out.println("Engine : start");
		subengine1.start();
		subengine2.start();
	}

}
