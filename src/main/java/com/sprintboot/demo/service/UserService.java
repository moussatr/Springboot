package com.sprintboot.demo.service;

import java.util.List;
import java.util.Optional;


import com.sprintboot.demo.modele.User;

public interface UserService {
	
	User create(User user);
	
	List<User> read();
	
	Optional<User> readuserbyID( Long USER_ID);
	

	
	String delete(Long USER_ID);	

}
