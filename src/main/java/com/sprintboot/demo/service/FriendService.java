package com.sprintboot.demo.service;

import java.util.List;


import com.sprintboot.demo.modele.User;

public interface FriendService {
	

	
	List<User> readFriend();
	
	
	User addFriend(User user, Long USER_ID);
	
	String deleteFriend(Long USER_ID);

}
