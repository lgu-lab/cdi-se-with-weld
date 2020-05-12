package org.demo.bean.sub;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SubEngine1 {

	//------------------------------------------------------------------------
	// Object life cycle management : constructor, postConstruct, preDestroy
	//------------------------------------------------------------------------
	/**
	 * Constructor
	 */
	public SubEngine1() {
		System.out.println("SubEngine1 : CONSTRUCTOR");
	}

	/**
	 * Just after component constructor
	 */
	@PostConstruct
	public void postConstruct() {
		System.out.println("SubEngine1 : postConstruct()");
	}

	/**
	 * When the component is about to be destroyed by the container.
	 * (typically when CDI container is about to shutdown)
	 */
	@PreDestroy
	public void preDestroy() {
		System.out.println("SubEngine1 : preDestroy()");
	}
	
	//------------------------------------------------------------------------
	// Features
	//------------------------------------------------------------------------
	public void start() {
		System.out.println("SubEngine #1 : start");
	}

}
