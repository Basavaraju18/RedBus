package com.jsp.redbus.util;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class ApplicationConfigaration {
   @Scheduled(cron = "0 1 * * * *")  // sec, min, hour, date month,  days of week  // it takes 6  parameter
	public void testSchedular() {
		System.out.println("Tested at :"+ LocalDateTime.now());
		System.out.println("Thread Name :"+Thread.currentThread().getName());

	}
}
