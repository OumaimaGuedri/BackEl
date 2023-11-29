package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UtilisateurServices;


@RestController
@RequestMapping("/utilisateur")
public class UserController {
	
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping
	public User createUtilisateur(@RequestBody User utilisateur) {
		/*return UtilisateurServices.createUtlisateur(utilisateur);*/
		
		return null;
	}


}
