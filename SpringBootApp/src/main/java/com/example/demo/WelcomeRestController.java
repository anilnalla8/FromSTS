package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/welcome")
public class WelcomeRestController {

	public WelcomeRestController() {
		System.out.println("WelcomeRestController : : Constructor");
	}
	
	@GetMapping(value= "{name}")
	public String welcome(@PathVariable String name) {
		String msg= "Hi " +name+ ", Welcome to REST API.....";
		return msg;
	}
	
	@GetMapping("/greet")
	public String greet() {
		return "Greetings ...";
	}
	
	@Getmapping("/hi")
	public String sayHi(){
		return "Hi....";
}
