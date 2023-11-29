package com.example.demo.Response;

import java.sql.Date;
import java.util.List;

public class JwtResponse {
	private String token;
	private String type = "Bearer";
	private Long id;
	private String nom;
	private String prenom;
	private Date datenaiss; 
	private String email;
	private int telephone;
	private String photo;
	private List<String> roles;
	
	
	
	
	public JwtResponse(String token, Long id, String nom, String prenom, Date datenaiss, String email,
			int telephone,   List<String> roles) {
		super();
		this.token = token;
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.datenaiss = datenaiss;
		this.email = email;
		this.telephone = telephone;
		this.roles = roles;
	}
	
	
	




	public JwtResponse(String token, String type, Long id, String nom, String prenom, Date datenaiss, String email,
			int telephone, String photo, List<String> roles) {
		super();
		this.token = token;
		this.type = type;
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.datenaiss = datenaiss;
		this.email = email;
		this.telephone = telephone;
		this.photo = photo;
		this.roles = roles;
	}







	public String getToken() {
		return token;
	}




	public void setToken(String token) {
		this.token = token;
	}




	public String getType() {
		return type;
	}




	public void setType(String type) {
		this.type = type;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}




	public String getPrenom() {
		return prenom;
	}




	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}




	public Date getDatenaiss() {
		return datenaiss;
	}




	public void setDatenaiss(Date datenaiss) {
		this.datenaiss = datenaiss;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public int getTelephone() {
		return telephone;
	}




	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}










	public List<String> getRoles() {
		return roles;
	}




	public void setRoles(List<String> roles) {
		this.roles = roles;
	}


	


	public String getPhoto() {
		return photo;
	}




	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	




	@Override
	public String toString() {
		return "JwtResponse [token=" + token + ", type=" + type + ", id=" + id + ", nom=" + nom + ", prenom=" + prenom
				+ ", datenaiss=" + datenaiss + ", email=" + email + ", telephone=" + telephone + ", roles=" + roles + "]";
	}

	


	
	


}
