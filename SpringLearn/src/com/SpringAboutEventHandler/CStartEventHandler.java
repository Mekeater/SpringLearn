package com.SpringAboutEventHandler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class CStartEventHandler implements ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("ContextStartedEvent Received");
	}
}
