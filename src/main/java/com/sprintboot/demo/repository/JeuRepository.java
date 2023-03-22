package com.sprintboot.demo.repository;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sprintboot.demo.modele.Jeu;

public interface JeuRepository extends JpaRepository<Jeu, Long> {
     
	List<Jeu> findByAvailableTrue();
    List<Jeu> findByUsers(User user);
}
