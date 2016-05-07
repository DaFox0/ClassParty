package fr.classparty.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Eleve {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEleve;
	private String nom;
	private String prenom;
	private String dateNaissance;
	/**
	 * Definit le type de l'utilisateur
	 * 0 : eleve
	 * 1 : moderateur
	 * 		Un moderateur gere sa classe
	 * 2 : administrateur
	 * 		Un administrateur gere les moderateurs et les classes
	 */
	private int type;
	private int classe;
	
	public Eleve(){
		super();
	}
	
	public Eleve(String nom, String prenom, String dateNaissance, int type, int classe){
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.type = type;
		this.classe = classe;
	}
	
	/**
	 * @return the idEleve
	 */
	public int getIdEleve() {
		return idEleve;
	}
	/**
	 * @param idEleve 
	 * the idEleve to set
	 */
	public void setIdEleve(int idEleve) {
		this.idEleve = idEleve;
	}
	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom 
	 * the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom 
	 * the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the dateNaissance
	 */
	public String getDateNaissance() {
		return dateNaissance;
	}
	/**
	 * @param dateNaissance 
	 * the dateNaissance to set
	 */
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}
	/**
	 * @param type 
	 * the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}
	/**
	 * @return the classe
	 */
	public int getClasse() {
		return classe;
	}
	/**
	 * @param classe
	 * the classe to set
	 */
	public void setClasse(int classe) {
		this.classe = classe;
	}
	

}
