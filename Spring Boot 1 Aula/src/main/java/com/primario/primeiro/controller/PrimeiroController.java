package com.primario.primeiro.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")

public class PrimeiroController {

	
	@GetMapping("/first")
	public String first() {
		
		return "First conception!!! ";
			
	}
	
	@GetMapping("/first2")
	public String first2() {
		
		return "First conception 2!!!";
		
	}
	
	public static void main(String[] args) {
	SpringApplication.run(PrimeiroController.class, args);
	
	
	}
}
	

