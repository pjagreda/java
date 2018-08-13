package com.maven.spring.test.Helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

public class app {

	public static void main(String[] args) {
		
		//ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext ("com/maven/spring/test/Helloworld/beans/beans.xml");
		
		
		Person person = (Person)context.getBean("person");
		person.speak();
		
		System.out.println(person);
		
		//((FileSystemXmlApplicationContext)context).close();
		((ClassPathXmlApplicationContext)context).close();
	}

}
