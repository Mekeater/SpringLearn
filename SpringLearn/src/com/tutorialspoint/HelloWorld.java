package com.tutorialspoint;

public class HelloWorld {
	private String message;
	private String message1;

	public String getMessage1() {
		System.out.println(message1);
		return message1;
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}

	public String getMessage() {
		System.out.println(message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init(){
	      System.out.println("Bean is going through init.");
	   }
	   public void destroy(){
	      System.out.println("Bean will destroy now.");
	   }
}
