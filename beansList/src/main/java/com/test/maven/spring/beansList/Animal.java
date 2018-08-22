package com.test.maven.spring.beansList;

public class Animal {

	private String name;
	private String type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Animal(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	public Animal() {}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", type=" + type + "]";
	}
	
	
	
}
