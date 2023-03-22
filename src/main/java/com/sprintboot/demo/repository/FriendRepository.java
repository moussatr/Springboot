package com.sprintboot.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprintboot.demo.modele.Friend;
import com.sprintboot.demo.modele.User;

public interface FriendRepository extends JpaRepository<Friend, Long> {
	
	

	Optional<Friend> findByUserAndFriend(User user, User friend);

}
