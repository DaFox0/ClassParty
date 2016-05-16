package fr.classparty.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Photo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPhoto;
	@ManyToOne
	private Eleve eleve;
	@OneToMany(mappedBy="photo")
	private Collection<Commentaire> commentaires;
	private String nom;
	private String lien;
	public Photo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Photo(int idPhoto, String nom, String lien) {
		this.idPhoto = idPhoto;
		this.nom = nom;
		this.lien = lien;
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

	public String getLien() {
		return lien;
	}

	public void setLien(String lien) {
		this.lien = lien;
	}
	
}
