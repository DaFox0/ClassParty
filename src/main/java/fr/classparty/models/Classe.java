package fr.classparty.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Classe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idClasse;
	@OneToMany(mappedBy="classe")
	private Collection<Eleve> eleves;
	@ManyToMany(mappedBy="classes")
	private Collection<Fichier> fichiers;
	private int annee;
	private String niveau;

	public Classe() {
		super();
		// TODO Auto-generated constructor stub
	}	
	public Classe(int idClasse, int annee, String niveau) {
		this.idClasse = idClasse;
		this.annee = annee;
		this.niveau = niveau;
	}
	public int getIdClasse() {
		return idClasse;
	}
	public void setIdClasse(int idClasse) {
		this.idClasse = idClasse;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	
}
