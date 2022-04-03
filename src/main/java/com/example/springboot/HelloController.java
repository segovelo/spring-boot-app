package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Collections;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

	@GetMapping("/get-greetings")
	public String index() {
		return "Hello !!! **** Greetings from Spring Boot! ****";
	}
	
	@GetMapping("/get-fake-data")
	public ResponseEntity<String> getFakeData() {
		ResponseEntity<String> response = null;
		
		WebClient client = WebClient.builder()
				  .baseUrl("http://localhost:8080")
				  .defaultCookie("cookieKey", "cookieValue")
				  .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE) 
				  .defaultUriVariables(Collections.singletonMap("url", "http://localhost:8080"))
				  .build();
		
		return response;
	}

}