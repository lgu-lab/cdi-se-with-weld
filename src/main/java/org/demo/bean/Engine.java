package org.demo.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.demo.bean.sub.SubEngine1;
import org.demo.bean.sub.SubEngine2;

public class Engine {

	@Inject
	private SubEngine1 subengine1;

	@Inject
	private SubEngine2 subengine2;

	//------------------------------------------------------------------------
	// Object life cycle management : constructor, postConstruct, preDestroy
	//------------------------------------------------------------------------
	/**
	 * Constructor
	 */
	public Engine() {
		System.out.println("Engine : CONSTRUCTOR");
	}

	/**
	 * Just after component constructor
	 */
	@PostConstruct
	public void postConstruct() {
		System.out.println("Engine : postConstruct()");
	}

	/**
	 * When the component is about to be destroyed by the container.
	 * (typically when CDI container is about to shutdown)
	 */
	@PreDestroy
	public void preDestroy() {
		System.out.println("Engine : preDestroy()");
	}
	
	//------------------------------------------------------------------------
	// Features
	//------------------------------------------------------------------------
	/**
	 * Starts the engine and all sub engines
	 */
	public void start() {
		System.out.println("Engine : start()");
		subengine1.start();
		subengine2.start();
	}

}
