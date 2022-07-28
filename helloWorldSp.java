package br.org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") //O mapping diz o endereço onde será acessado    localhost: 8080/hello

public class helloWorldSp {

	@GetMapping //"coloque a info abaixo no endereço"
	
	public String hello() {
		
		return "Hell-o, World! Hell-o, Spring!";
	}
}
