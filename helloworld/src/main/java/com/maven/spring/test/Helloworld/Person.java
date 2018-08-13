package com.maven.spring.test.Helloworld;

public class Person {
	
	private int id;
	
	private String name;
	
	private int taxId;
	
	
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public Person(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

//	@Override
//	public String toString() {
//		return "Person [id=" + id + ", name=" + name + "]";
//	}

	public void speak() {
		System.out.println("I'm a person");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + "]";
	}
}
