package com.SpringAboutDefinedEvent;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	 public static void main(String[] args) {
		 
		 ////ÓÐ´íÎó£¬Ã»¸ã¶®!!!
		 
	      ConfigurableApplicationContext context =new ClassPathXmlApplicationContext("Beans12.xml");    
	      CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");
	      cvp.publish();  
	      cvp.publish();
	   }
}
