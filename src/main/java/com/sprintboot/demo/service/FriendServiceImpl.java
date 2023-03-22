package com.sprintboot.demo.service;





import org.springframework.stereotype.Service;

import com.sprintboot.demo.modele.Friend;
import com.sprintboot.demo.modele.User;
import com.sprintboot.demo.repository.FriendRepository;
import com.sprintboot.demo.repository.UserRepository;
@Service

public  class FriendServiceImpl implements FriendService {
	
	private final FriendRepository friendRepository;
	
     private final UserRepository userrepository;
	

	

	public FriendServiceImpl(FriendRepository friendRepository, UserRepository userrepository) {
		super();
		this.friendRepository = friendRepository;
		this.userrepository = userrepository ;
	}


	@Override
	public User readuserbyID( Long USER_ID) {
	 	
		userrepository.findById(USER_ID);
		return null;
	}


	@Override
	  public Friend addFriend( Long userId, Long friendId) {
        User user = userrepository.findById(userId).orElse(null);
        User friend = userrepository.findById(friendId).orElse(null);
        if (user != null && friend != null) {
            Friend newFriend = new Friend();
            newFriend.setUser(user);
            newFriend.setFriend(friend);
            return friendRepository.save(newFriend);
        }
        return null;
    }


	@Override
	public Friend deleteFriend(Long userId, Long friendId) {
		  User user = userrepository.findById(userId).orElse(null);
	        User friend = userrepository.findById(friendId).orElse(null);
	        if (user != null && friend != null) {
	            Friend newFriend = new Friend();
	            newFriend.setUser(user);
	            newFriend.setFriend(friend);
	            return friendRepository.save(newFriend);
	        }
	        return null;
	}



}
