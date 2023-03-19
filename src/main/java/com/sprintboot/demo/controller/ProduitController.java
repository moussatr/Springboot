package com.sprintboot.demo.controller;

import java.util.List;



import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprintboot.demo.modele.Produit;
import com.sprintboot.demo.service.ProduitService;



@RestController
@RequestMapping("/produit")

public class ProduitController {
	private final ProduitService produitService;
	
	
	public ProduitController(ProduitService produitService) {
		
		this.produitService = produitService;
	}

	@PostMapping("/create")
	public Produit create(@RequestBody Produit produit) {
		return produitService.creer(produit);
		
	}
	
	@GetMapping("/read")
	public List<Produit> read() {
		return produitService.lire();
	}
	
	@PutMapping("/update/{id}")
	public Produit update(@PathVariable Long id, @RequestBody Produit produit) {
		return produitService.modifier(id, produit);
	}
    
	 @DeleteMapping("/delete/{id} ")
	 public String delete(@PathVariable Long id) {
		 return produitService.suprimer(id);
	 }
}
