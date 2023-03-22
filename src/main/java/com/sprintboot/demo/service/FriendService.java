package com.sprintboot.demo.service;


import com.sprintboot.demo.modele.Friend;
import com.sprintboot.demo.modele.User;

public interface FriendService {
	User readuserbyID( Long USER_ID);
	


	Friend addFriend(Long userId, Long friendId);
    Friend deleteFriend(Long userId, Long friendId);

}
