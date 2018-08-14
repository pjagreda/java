package com.maven.spring.test.Helloworld;

public class Address {
	private String street;
	private String postcode;
	
	public Address(String street, String postcode) {
		
		this.street = street;
		this.postcode = postcode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", postcode=" + postcode + "]";
	}
	
	public void init()
	{
		System.out.println("Init Address");
	}
	
	public Address() {
		
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
}
