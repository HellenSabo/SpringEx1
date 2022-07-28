package br.org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/obj")

public class Objetivos {
	
	@GetMapping
	
	public String obj () {
		
		return "Spring boot e MySQL";
	}

}
