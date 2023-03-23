package com.sprintboot.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprintboot.demo.modele.User;

public interface UserRepository extends JpaRepository<User, Long>{



}
