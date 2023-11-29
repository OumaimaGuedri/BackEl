package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.ERole;
import com.example.demo.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>  {


		 //CRUD Bassique
		    Optional<User> findByEmail(String email);
			public boolean existsByprenom(String prenom);
			public boolean existsByEmail(String email);
			public List<User> findByNomAndPrenom(String nom , String prenom);
			User findByNom(String nom);
			public List <User>findByRolesName(ERole name);
			public User findUtilisateurById(Long id);

		//CRUD Avancée
			@Query("SELECT u from User u ORDER BY poids ASC")
			public List<User> GetMinPoids ();
		     

		 
		 
	}


