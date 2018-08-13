package com.maven.spring.test.Helloworld;

public class Person {
	
	private int id;
	private String name;
	private int taxId;
	private Address address;
	
	
	
	public void setAddress(Address address) {
		this.address = address;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}
	
	public static Person getInstance(int id, String name) {
		System.out.println("Person Using Factory Method");
		return new Person(id,name);
		
	}

	public Person(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public void onCreate() {
		System.out.println("Person created: " + this);
	}
	
	public void onDestroy() {
		System.out.println("Person destroyed.");
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
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + "]";
	}

//	@Override
//	public String toString() {
//		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + "]";
//	}
	
	
}
