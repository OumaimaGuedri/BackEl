package com.example.demo.service;

import com.example.demo.entities.User;

public interface UtilisateurServices {
	public User findUtilisateurById(Long id);
	public User createUtlisateur(User utilisateur);
	public User updateUtlisateur(User utilisateur);
	public void deleteUtlisateur(Long id);


}
