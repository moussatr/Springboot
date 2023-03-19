package com.sprintboot.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sprintboot.demo.modele.Jeu;

import com.sprintboot.demo.repository.JeuRepository;


@Service
public class JeuServiceImpl implements JeuService {
	
	private final JeuRepository jeurepository;
	
	
	
  

	public JeuServiceImpl(JeuRepository jeurepository) {
		super();
		this.jeurepository = jeurepository;
	}

	@Override
	public Jeu create(Jeu jeu) {
		// TODO Auto-generated method stub
		return jeurepository.save(jeu);
	}

	@Override
	public List<Jeu> read() {
		// TODO Auto-generated method stub
		return jeurepository.findAll();
	}


	@Override
	public String delete(Long JEU_ID) {
		jeurepository.deleteById(JEU_ID);
		return "Jeu supprimer ";
	}

	@Override
	public Optional<Jeu> readjeubyID(final Long id) {
		
		return jeurepository.findById(id);
	}

}
