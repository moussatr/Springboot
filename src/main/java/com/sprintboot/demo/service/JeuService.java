package com.sprintboot.demo.service;

import java.util.List;
import java.util.Optional;

import com.sprintboot.demo.modele.Jeu;


public interface JeuService {
    Jeu create(Jeu jeu);
	
	List<Jeu> read();
	Optional<Jeu> readjeubyID( Long JEU_ID);
	

	
	String delete(Long JEU_ID);	

}
