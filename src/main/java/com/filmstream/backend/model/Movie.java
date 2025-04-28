package com.filmstream.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;
	private String img;
	private String telegram;

	// ✅ Constructeur par défaut obligatoire
	public Movie() {
	}

	// ✅ Constructeur personnalisé
	public Movie(String title, String img, String telegram) {
		this.title = title;
		this.img = img;
		this.telegram = telegram;
	}

	// ✅ Getters et setters obligatoires
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getTelegram() {
		return telegram;
	}

	public void setTelegram(String telegram) {
		this.telegram = telegram;
	}
}
