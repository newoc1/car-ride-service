package com.grok.crs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarRideController {

	
	
	@RequestMapping(value = "/api/cars", method = RequestMethod.GET)
	public TestFake getCars() {
		System.out.println("got here");
		return new TestFake("Bob", 1023);
	}
}
