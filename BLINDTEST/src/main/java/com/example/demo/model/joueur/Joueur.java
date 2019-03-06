package com.example.demo.model.joueur;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Joueur {

	@NotEmpty @Getter @Setter
	private String pseudo;
	
	@NotEmpty @Getter @Setter
	private String mail;
	
	@NotEmpty @Getter @Setter
	private String password;
	
	@NotNull @NotEmpty @Getter @Setter
	private int score;
	
	protected Joueur() {
	}
	
	public Joueur(@NotEmpty String pseudo, @NotEmpty String mail, @NotEmpty String password,
			@NotNull @NotEmpty int score) {
		this.pseudo = pseudo;
		this.mail = mail;
		this.password = password;
		this.score = score;
	}
}
