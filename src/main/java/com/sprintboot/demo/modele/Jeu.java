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
@Table(name = "JEU")
public class Jeu {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    
    private Long JEU_ID;
	@Column(length = 50)
	private String title;
	@Column(length = 80)
	private String cover;
    
	@ManyToMany
	@JoinTable(name = "USER_GAME",
	joinColumns = @JoinColumn(name = "USER_ID"),
	inverseJoinColumns = @JoinColumn(name = "JEU_ID"))
	private List<User> user = new ArrayList<>();
	
	public Jeu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getJEU_ID() {
		return JEU_ID;
	}

	public void setJEU_ID(Long jEU_ID) {
		JEU_ID = jEU_ID;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}


}
