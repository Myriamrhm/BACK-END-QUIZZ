package com.example.demo.model.admin;

import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

public class Admin {
	
	@NotEmpty @Getter @Setter
	private String nom;
	
	@NotEmpty @Getter @Setter
	private String mail;
	
	@NotEmpty @Getter @Setter
	private String password;

	public Admin(@NotEmpty String nom, @NotEmpty String mail, @NotEmpty String password) {
		this.nom = nom;
		this.mail = mail;
		this.password = password;
	}
	
	protected Admin() {
	}

}
