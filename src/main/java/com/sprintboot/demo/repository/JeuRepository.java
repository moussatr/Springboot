package com.sprintboot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprintboot.demo.modele.Jeu;

public interface JeuRepository extends JpaRepository<Jeu, Long> {

}
