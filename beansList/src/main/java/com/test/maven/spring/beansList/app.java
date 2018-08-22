package com.test.maven.spring.beansList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {

	public static void main(String[] args) {
		//System.out.println("hello");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/test/maven/spring/beansList/beans/beans2.xml");

		Jungle jungle = (Jungle)context.getBean("jungle");
		System.out.println(jungle);
		((ClassPathXmlApplicationContext)context).close();
		
		
	}

}
