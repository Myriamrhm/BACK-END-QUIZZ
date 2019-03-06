package com.example.demo.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/admin")
public class ControlAdmin {

	@GetMapping ("/me")
	public String me() {
		return "Hello ?";
	}
}
