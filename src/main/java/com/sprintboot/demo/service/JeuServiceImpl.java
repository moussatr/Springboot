package com.sprintboot.demo.service;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import com.sprintboot.demo.modele.Jeu;

import com.sprintboot.demo.repository.JeuRepository;
import com.sprintboot.demo.repository.UserRepository;


@Service
public class JeuServiceImpl implements JeuService {
	
	private final JeuRepository jeurepository;
	private final UserRepository userRepository;
	
	
	

	public JeuServiceImpl(JeuRepository jeurepository, UserRepository userRepository) {
		super();
		this.jeurepository = jeurepository;
		this.userRepository = userRepository;
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

	@Override
	public List<Jeu> Jeudispos() {
		return jeurepository.findByAvailableTrue();
	}

	@Override
	public List<Jeu> MesJeux(Long USER_ID) {
		User user = (User) userRepository.findById(USER_ID).orElse(null);
        if (user != null) {
            return jeurepository.findByUsers(user);
        }
        return null;
	}

	@Override
	public Jeu Jeu_a_Achete(Long USER_ID, Long JEU_ID) {
		 User user =  (User) userRepository.findById(USER_ID).orElse(null);
	        Jeu jeu = jeurepository.findById(JEU_ID).orElse(null);
	        if (user != null && jeu != null && jeu.isAvailable() && !jeu.getUsers().contains(user)) {
	            jeu.setAvailable(false);
	            jeu.getUsers().add((com.sprintboot.demo.modele.User) user);
	            return jeurepository.save(jeu);
	        }
	        return null;
	}

}
