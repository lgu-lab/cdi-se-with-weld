package org.demo.bean.sub.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.demo.bean.sub.SubEngine2;

public class SubEngine2Impl implements SubEngine2 {

	//------------------------------------------------------------------------
	// Object life cycle management : constructor, postConstruct, preDestroy
	//------------------------------------------------------------------------
	/**
	 * Constructor
	 */
	public SubEngine2Impl() {
		System.out.println("SubEngine2Impl : CONSTRUCTOR");
	}

	/**
	 * Just after component constructor
	 */
	@PostConstruct
	public void postConstruct() {
		System.out.println("SubEngine2Impl : postConstruct()");
	}

	/**
	 * When the component is about to be destroyed by the container.
	 * (typically when CDI container is about to shutdown)
	 */
	@PreDestroy
	public void preDestroy() {
		System.out.println("SubEngine2Impl : preDestroy()");
	}
	
	//------------------------------------------------------------------------
	// Features
	//------------------------------------------------------------------------
	
	public void start() {
		System.out.println("SubEngine #2 : start");
	}

}
