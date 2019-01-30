package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/getInfo")
	public @ResponseBody String getInfo() {
		return "Welcome to my first Spring Boot Service!";
	}
}
