package fr.classparty.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Eleve {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEleve;
	@ManyToOne
	private TypeUtilisateur type;
	@OneToMany(mappedBy="eleve")
	private Collection<Photo> photos;
	@ManyToOne
	private Classe classe;
	@OneToMany(mappedBy="eleve")
	private Collection<Fichier> fichiers;
	@OneToMany(mappedBy="eleve")
	private Collection<Commentaire> commentaires;
	private String nom;
	private String prenom;
	private String dateNaissance;
	private String login;
	private String password;
	/**
	 * Definit le type de l'utilisateur
	 * 1 : eleve
	 * 2 : moderateur
	 * 		Un moderateur gere sa classe
	 * 3 : administrateur
	 * 		Un administrateur gere les moderateurs et les classes
	 */
	
	
	
	public Eleve(){
		super();
	}
	
	public Eleve(String nom, String prenom, String dateNaissance, String login, String password){
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.login = login;
		this.password = password;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public TypeUtilisateur getType() {
		return type;
	}

	public void setType(TypeUtilisateur type) {
		this.type = type;
	}

}
