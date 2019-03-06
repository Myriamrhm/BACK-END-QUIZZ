package com.example.demo.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/joueur")
public class Controljoueur {

	@GetMapping ("/joueur")
	public String joueur() {
		return "Let's go ?";
	}
}

