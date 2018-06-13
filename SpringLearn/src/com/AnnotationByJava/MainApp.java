package com.AnnotationByJava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	 public static void main(String[] args) {
		 ApplicationContext context=new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		 HelloWorld helloWorld=context.getBean(HelloWorld.class);
		 helloWorld.setMessage("Hello World");
		 helloWorld.getMessage();
		 
		 //JAVA×¢ÊÍ£¬Beans×¢Èë
		 ApplicationContext ctx = new AnnotationConfigApplicationContext(TextEditorConfig.class);
		 TextEditor te = ctx.getBean(TextEditor.class);
		 te.spellCheck();
	 }
}
