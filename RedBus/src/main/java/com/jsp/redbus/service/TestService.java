package com.jsp.redbus.service;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	@Async
	public void testAsynchronus(){
		System.err.println("thread Started at :"+LocalDateTime.now()+" with "+ Thread.currentThread().getName());
		
		
		for(int i=0;  i<10; i++) {
			System.out.println("Asynchronous call"+ Thread.currentThread().getName()+"for "+i);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.err.println("Thread started at "+LocalDateTime.now()+" with"+Thread.currentThread().getName());
		
	}

}
