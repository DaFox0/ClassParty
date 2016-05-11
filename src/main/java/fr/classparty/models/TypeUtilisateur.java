package fr.classparty.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TypeUtilisateur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTypeUtilisateur;
	private String nom;
	@OneToMany(mappedBy="type")
	private Collection<Eleve> eleves;
	public TypeUtilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TypeUtilisateur(int idTypeUtilisateur, String nom) {
		this.idTypeUtilisateur = idTypeUtilisateur;
		this.nom = nom;
	}
	public int getIdTypeUtilisateur() {
		return idTypeUtilisateur;
	}
	public void setIdTypeUtilisateur(int idTypeUtilisateur) {
		this.idTypeUtilisateur = idTypeUtilisateur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
