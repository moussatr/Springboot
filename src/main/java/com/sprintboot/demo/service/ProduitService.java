package com.sprintboot.demo.service;

import java.util.List;



import com.sprintboot.demo.modele.Produit;

public interface ProduitService {
	
	
	
	Produit creer(Produit produit);
	
	List<Produit> lire();
	
	Produit modifier(Long id, Produit produit);
	
	String suprimer(Long id);
	

}
