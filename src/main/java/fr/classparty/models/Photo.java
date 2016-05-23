package fr.classparty.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Photo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPhoto;
	@ManyToOne
	private Eleve eleve;
	private String nom;
	public Photo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Photo(int idPhoto, String nom) {
		this.idPhoto = idPhoto;
		this.nom = nom;
	}

	public int getIdPhoto() {
		return idPhoto;
	}
	
	public void setIdPhoto(int idPhoto) {
		this.idPhoto = idPhoto;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
