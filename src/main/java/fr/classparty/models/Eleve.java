package fr.classparty.models;

public class Eleve {
	private int idEleve;
	private String nom;
	private String prenom;
	private int age;
	/**
	 * Définit le type de l'utilisateur
	 * 0 : élève
	 * 1 : modérateur
	 * 		Un modérateur gère sa classe
	 * 2 : administrateur
	 * 		Un administrateur gère les modérateurs et les classes
	 */
	private int type;
	private int classe;
	
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age 
	 * the age to set
	 */
	public void setAge(int age) {
		this.age = age;
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
