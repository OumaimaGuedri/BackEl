package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;


@Service
public class UtilisateurServicesImpl implements UtilisateurServices  {
	
	@Autowired
	private UserRepository utilisateurRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;


	@Override
	public User findUtilisateurById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User createUtlisateur(User utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUtlisateur(User utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUtlisateur(Long id) {
		// TODO Auto-generated method stub
		
	}
	

}
