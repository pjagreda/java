package com.maven.spring.test.Helloworld;

public class PersonFactory {
	
	public Person createPerson(int id, String name) {
		System.out.println("Using class factory person");
		return new Person(id,name);
	}
	

}
