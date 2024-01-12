package com.jsp.redbus.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.redbus.service.TestService;


@RestController
public class TestController {
	
	@Autowired
	private TestService service;
	
	@GetMapping("/RedBus/asynchro-call")
	public void testAsynchroBehaviour() {
		service.testAsynchronus();
		
	}

}
