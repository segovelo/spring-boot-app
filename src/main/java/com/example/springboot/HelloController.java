package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

	@GetMapping("/get-greetings")
	public String index() {
		return "Hello !!! **** Greetings from Spring Boot! ****";
	}

}