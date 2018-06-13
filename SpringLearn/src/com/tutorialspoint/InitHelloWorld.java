package com.tutorialspoint;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorld implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("AfterInitialization : " + arg0);
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object beanName, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("BeforeInitialization : " + beanName);
		return beanName;
	}
	
	private String message;
    private String message1;
	private String message2;
	public String getMessage() {
		System.out.println(message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage1() {
		System.out.println(message1);
		return message1;
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}

	public String getMessage2() {
		System.out.println(message2);
		return message2;
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}
	public void init() {
		
	}
	public void destroy() {
		
	}
	
}
