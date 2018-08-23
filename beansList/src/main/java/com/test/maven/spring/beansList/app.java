package com.test.maven.spring.beansList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {

	public static void main(String[] args) {
		//System.out.println("hello");
		
//		ApplicationContext context2 = new ClassPathXmlApplicationContext("/com/test/maven/spring/beansList/beans/beans2.xml");
//
//		Jungle jungle = (Jungle)context2.getBean("jungle");
//		System.out.println(jungle);
//		((ClassPathXmlApplicationContext)context2).close();
//		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/test/maven/spring/beansList/beans/beans.xml");

		JungleMap junglemap = (JungleMap)context.getBean("junglemap");
		System.out.println(junglemap);
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
