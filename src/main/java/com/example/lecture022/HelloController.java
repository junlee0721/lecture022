package com.example.lecture022;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class HelloController {
	@GetMapping("hello-world")
	public String helloWorld() {
		return "Hello World";
	}
}
