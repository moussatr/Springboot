package com.sprintboot.demo.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprintboot.demo.modele.Jeu;
import com.sprintboot.demo.service.JeuService;

@RestController
@RequestMapping("/api")
public class JeuController {
	
	private final JeuService jeuService;
	public JeuController(JeuService jeuService) {
		super();
		this.jeuService = jeuService; 
	}

	@PostMapping("/store/games")
	public Jeu create(@RequestBody Jeu jeu) {
	    System.out.println("Nouveau jeu ajouter");
	    System.out.println("---------------------------------------------");
	    System.out.println(jeu.toString());
		return jeuService.create(jeu);
		
	}
	
	@GetMapping("/store/games")
	public List<Jeu> read() {
		
		return jeuService.read();
	}
	
	@GetMapping("/store/games/{JEU_ID}")
	public Optional<Jeu> readjeubyID(@PathVariable Long JEU_ID, @RequestBody Jeu jeu) {
		return jeuService.readjeubyID(JEU_ID);
	}
	

    
	 @DeleteMapping("/store/games/{JEU_ID}")
	 public String delete(@PathVariable Long JEU_ID) {
		 return jeuService.delete(JEU_ID);
	 }

	 
	  @GetMapping("/available")
	    public List<Jeu> Jeudispos() {
		     
	        return jeuService.Jeudispos();
	    }
	  

	    @GetMapping("/users/{userId}/games")
	    public List<Jeu> MesJeux(@PathVariable Long userId) {
	        return jeuService.MesJeux(userId);
	    }
	    
	    @PostMapping("/users/{userId}/games")
	    public Jeu Jeu_a_Achete(@PathVariable Long userId, @PathVariable Long gameId) {
	        return jeuService.Jeu_a_Achete(userId, gameId);
	    }
}
