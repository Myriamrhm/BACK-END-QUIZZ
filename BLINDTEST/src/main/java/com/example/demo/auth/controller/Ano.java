package com.example.demo.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/anonymous")

public class Ano {


	@GetMapping ("/anonymous")
	public String ano() {
		return "Who am I ?";
	}
}
