package com.maven.spring.test.Helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

public class app {

	public static void main(String[] args) {
		
		//ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext ("com/maven/spring/test/Helloworld/beans/beans.xml");
		
		
		Person person = (Person)context.getBean("person");
//		person.speak();
		
		//Address address = (Address)context.getBean("address");
		
//		Person person2 = (Person)context.getBean("person");
		
		
//		person2.setTaxId(999);
		
		System.out.println(person);
//		System.out.println(person2);
//		System.out.println(address);
		
		//((FileSystemXmlApplicationContext)context).close();
		((ClassPathXmlApplicationContext)context).close();
	}

}
