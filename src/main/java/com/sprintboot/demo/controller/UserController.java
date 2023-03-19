package com.sprintboot.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprintboot.demo.modele.User;
import com.sprintboot.demo.service.UserService;


@RestController
@RequestMapping("/api")
 public class UserController {
   private final UserService userService;
 
 	public UserController(UserService userService) {
	super();
	this.userService = userService;
    }

	@PostMapping("/users")
	public User create(@RequestBody User user) {
		return userService.create(user);
		
	}
	
	@GetMapping("/users")
	public List<User> read() {
		return userService.read();
	}
	
	@GetMapping("/users/{USER_ID}")
	public Optional<User> readuser(@PathVariable Long USER_ID, @RequestBody User user) {
		return userService.readuserbyID( USER_ID);
	}
	
	@PostMapping("/users/{USER_ID}")
	public User update(@PathVariable Long USER_ID, @RequestBody User user) {
		return userService.update(user, USER_ID);
	}
    
	 @DeleteMapping("/users/{USER_ID}")
	 public String delete(@PathVariable Long USER_ID) {
		 return userService.delete(USER_ID);
	 }
  
}
