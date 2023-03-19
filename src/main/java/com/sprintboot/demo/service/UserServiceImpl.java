package com.sprintboot.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sprintboot.demo.modele.User;
import com.sprintboot.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	private final UserRepository userrepository;
	

	public UserServiceImpl(UserRepository userrepository) {
		super();
		this.userrepository = userrepository;
	}

	@Override
	public User create(User user) {
		// TODO Auto-generated method stub
		
		return userrepository.save(user);
	}

	@Override
	public List<User> read() {
		// TODO Auto-generated method stub
		return userrepository.findAll();
	}

	@Override
	public User update(User user, Long USER_ID) {
		// TODO Auto-generated method stub
		return userrepository.findById(USER_ID)
				.map(u -> {
					
					u.setGames(user.getGames());
					
					
					return userrepository.save(u);
				}).orElseThrow(() -> new RuntimeException("Produit non trouvé"));
	}

	@Override
	public String delete(Long USER_ID) {
		userrepository.deleteById(USER_ID); 
		return "Utilisateur supprimer";
	}

	@Override
	public Optional<User> readuserbyID( Long USER_ID) {
	 	
		return userrepository.findById(USER_ID);
	}


}
