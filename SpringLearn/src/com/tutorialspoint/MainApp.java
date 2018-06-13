package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		
//		@SuppressWarnings("resource")
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Beans1.xml");
//		HelloWorld obj1=(HelloWorld)applicationContext.getBean("helloWorld");
//		obj1.setMessage("shy message one");
//		obj1.getMessage();
//		HelloWorld obj2=(HelloWorld)applicationContext.getBean("helloWorld");
//		obj2.getMessage();
		@SuppressWarnings("resource")
		AbstractApplicationContext abstractApplicationContext=new ClassPathXmlApplicationContext("Beans1.xml");
		HelloWorld obj3=(HelloWorld)abstractApplicationContext.getBean("helloWorld");
		obj3.getMessage();
		obj3.getMessage1();
		InitHelloWorld obj4=(InitHelloWorld)abstractApplicationContext.getBean("helloWorld1");
		obj4.getMessage();
		obj4.getMessage1();
		obj4.getMessage2();
		
		abstractApplicationContext.registerShutdownHook();
	}
}
