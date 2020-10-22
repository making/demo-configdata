package com.example.democonfigdata;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	private final String message;

	public HelloController(@Value("${data.message:dummy}") String message) {
		this.message = message;
	}

	@GetMapping(path = "/")
	public String message() {
		return this.message;
	}
}
