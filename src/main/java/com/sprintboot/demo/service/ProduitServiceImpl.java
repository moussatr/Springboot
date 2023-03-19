package com.sprintboot.demo.service;

import java.util.List;



import org.springframework.stereotype.Service;

import com.sprintboot.demo.modele.Produit;
import com.sprintboot.demo.repository.ProduitRepositoy;



@Service

public class ProduitServiceImpl implements ProduitService {
	
	private  ProduitRepositoy produitRepository;
	
	

	public ProduitServiceImpl(ProduitRepositoy produitRepository) {
		super();
		this.produitRepository = produitRepository;
	}

	@Override
	public Produit creer(Produit produit) {
		// TODO Auto-generated method stub
		return produitRepository.save(produit);
	}

	@Override
	public List<Produit> lire() {
		// TODO Auto-generated method stub
		return  produitRepository.findAll();
	}

	@Override
	public Produit modifier(Long id, Produit produit) {
		// TODO Auto-generated method stub
		return produitRepository.findById(id)
				.map(p-> {
					p.setNom(produit.getNom());
					p.setPrix(produit.getPrix());
					p.setDesription(produit.getDesription());
					return produitRepository.save(p);
					
				}).orElseThrow(() -> new RuntimeException("Produit non trouvé"));
	}

	@Override
	public String suprimer(Long id) {
		produitRepository.deleteById(id);
		
		return "Produit supprimer";
	}

}
