package com.DIBySetValue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans3.xml");
		TextEditor textEditor=(TextEditor)context.getBean("textEditor");
		textEditor.spellCheck();
	}
}
