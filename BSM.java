package br.org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")

public class BSM {
	
	@GetMapping
	
	public String bsm() {
	
		return "Orientação ao futuro; responsabilidade pessoal; mentalidade de crescimento; persistência; habilidades; trabalho em equipe; proatividade e comunicação";
	}

}
