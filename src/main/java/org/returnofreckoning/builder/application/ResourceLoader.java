package org.returnofreckoning.builder.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.returnofreckoning.builder.resources.AbilityResource;

@ApplicationPath("/builder")
public class ResourceLoader extends Application {

	private Set<Class<?>> instanceResources = new HashSet<>();
	private Set<Object> singletonResources = new HashSet<>();
	
	public ResourceLoader() {
		System.out.println("*****     Resource loader started     *****");
		this.instanceResources.add(AbilityResource.class);
		//this.singletonResources.add(new AbilityResource());
	}

	@Override
	public Set<Class<?>> getClasses() {
		return instanceResources;
	}

	@Override
	public Set<Object> getSingletons() {
		return singletonResources;
	}
	
	
}
