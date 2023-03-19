package com.sprintboot.demo.modele;



import java.util.ArrayList;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import jakarta.persistence.Table;

@Entity
@Table(name ="USER")
public class User {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id

	private Long USER_ID;
	@Column(length = 50)
	private String username;
	@Column(length = 80)
	private String email;
	
	
	@ManyToMany
	@JoinTable(name = "USER_GAME",
	joinColumns = @JoinColumn(name = "USER_ID"),
	inverseJoinColumns = @JoinColumn(name = "JEU_ID"))
	private List<Jeu> games = new ArrayList<>();
	
	

	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(Long uSER_ID) {
		USER_ID = uSER_ID;
	}

	

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Jeu> getGames() {
		return games;
	}
	public void setGames(List<Jeu> games) {
		this.games = games;
	}
    
	
	
	
}
