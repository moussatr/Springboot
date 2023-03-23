package com.sprintboot.demo.controller;



import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprintboot.demo.modele.Friend;


import com.sprintboot.demo.service.FriendService;

@RestController
@RequestMapping("/api")
public class FriendController {
	
	private final FriendService friendService;
	
	
	
	public FriendController(FriendService friendService) {
		super();
		this.friendService = friendService;
	}

    @PostMapping("/users/{userId}/friends")
    public Friend addFriend(@PathVariable Long userId, @PathVariable Long friendId)  {
//    	  User user = friendService.readuserbyID(userId);
    	  return friendService.addFriend(userId,friendId);
    }
    
    @DeleteMapping("/api/users/{userId}/friends/{friendId}")
    public Friend deleteFriend(@PathVariable Long userId, @PathVariable Long friendId)  {
//    	  User user = friendService.readuserbyID(userId);
    	  return friendService.deleteFriend(userId,friendId);
    }
    		
//
//	@PostMapping("/users/{userId}/friends")
//    public void addFriend(@PathVariable Long userId, @RequestBody User friend) {
//        User user = friendService.readuserbyID(userId);
//        friendService.addFriend(user, friend);
//    }
//	
//	
//
//    @DeleteMapping("/{id}")
//    public void removeFriend( @RequestBody User friend, @PathVariable Long userId) {
//    	User user = friendService.readuserbyID(userId);
//    	friendService.removeFriend(user, friend);
//    }

}
