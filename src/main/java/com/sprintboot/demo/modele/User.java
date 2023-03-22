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
import jakarta.persistence.OneToMany;
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
	
	 @OneToMany(mappedBy = "user")
	    private List<Friend> friends = new ArrayList<>();
	
    public List<Friend> getFriends() {
		return friends;
	}

	public void setFriends(List<Friend> friends) {
		this.friends = friends;
	}
	@ManyToMany
    @JoinTable(name = "user_game",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "game_id"))
    private List<Jeu> games;

	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public List<Jeu> getGames() {
		return games;
	}

	public void setGames(List<Jeu> games) {
		this.games = games;
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

    
	
	
	
}
