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
		
		return "</br>Mentalidades:</br>1-Mentalidade de Crescimento.</br>2-Persistência."
				+"</br>3-Orientação ao Futuro."+"</br>Habilidades:</br>1-Atenção aos detalhes."
						+"</br>2-Trabalho em equipe.";
			
	}
	
	@GetMapping("/first2")
	public String first2() {
		
		return "</br>Meus objetivos de aprendizagem para está semana:"+
				 "</br>1-Conseguir dominar o conceito de Spring Boot.</br>2-Aprender a criar meu próprio\"Maven\", sem auxilio de ferramentas online.";
		
	}
	
	public static void main(String[] args) {
	SpringApplication.run(PrimeiroController.class, args);
	
	
	}
}
	

