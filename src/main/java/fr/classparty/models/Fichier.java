package fr.classparty.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Fichier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFichier;
	@ManyToOne
	private Eleve eleve;
	@ManyToMany
	private Collection<Classe> classes;
	private String nom;
	private String lien;
	public Fichier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fichier(int idFichier, String nom, String lien) {
		this.idFichier = idFichier;
		this.nom = nom;
		this.lien = lien;
	}
	public int getIdFichier() {
		return idFichier;
	}
	public void setIdFichier(int idFichier) {
		this.idFichier = idFichier;
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
