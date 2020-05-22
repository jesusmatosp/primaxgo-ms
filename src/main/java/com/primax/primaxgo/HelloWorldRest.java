package com.primax.primaxgo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRest {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hola Mundo";
	}
	
}
