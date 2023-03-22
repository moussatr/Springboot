package com.sprintboot.demo.modele;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="FRIEND")
public class Friend {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "friend_id")
    private User friend;
	public Friend() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Friend(User user2, User friend) {
		super();
		this.user = user2;
		this.friend = friend;
	}


	public Friend(Long id, User user, User friend) {
		super();
		this.id = id;
		this.user = user;
		this.friend = friend;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public User getFriend() {
		return friend;
	}
	public void setFriend(User friend) {
		this.friend = friend;
	}
    
    

}
