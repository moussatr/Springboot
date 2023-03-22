package com.sprintboot.demo.service;

import java.util.List;
import java.util.Optional;

import com.sprintboot.demo.modele.Jeu;


public interface JeuService {
    Jeu create(Jeu jeu);
	
	List<Jeu> read();
	Optional<Jeu> readjeubyID( Long JEU_ID);
	
	String delete(Long JEU_ID);	
	
	List<Jeu> Jeudispos();
	List<Jeu> MesJeux(Long USER_ID);
	Jeu Jeu_a_Achete(Long USER_ID, Long JEU_ID);

}
