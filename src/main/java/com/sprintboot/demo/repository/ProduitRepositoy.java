package com.sprintboot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sprintboot.demo.modele.Produit;

public interface ProduitRepositoy extends JpaRepository<Produit, Long>{

}
