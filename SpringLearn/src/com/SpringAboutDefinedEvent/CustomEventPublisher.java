package com.SpringAboutDefinedEvent;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware {

	ApplicationEventPublisher publisher;

	public void setPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
	public void publish() {
	      CustomEvent ce = new CustomEvent(this);
	      publisher.publishEvent(ce);
	   }
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}
