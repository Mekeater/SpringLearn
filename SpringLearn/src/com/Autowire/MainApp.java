package com.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
	      ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans6.xml");
	      TextEditor te = (TextEditor) context.getBean("textEditor");
	      te.spellCheck();
	      te.getName();
	   }
}
