package fr.classparty.dto;

import fr.classparty.models.Eleve;

public class EleveDTO {
	private int idEleve;
	private String nom;
	private String prenom;
	private int age;
	private int type;
	private int classe;
	
	public EleveDTO(Eleve eleve){
		idEleve = eleve.getIdEleve();
		nom = eleve.getNom();
		prenom = eleve.getPrenom();
		age = eleve.getAge();
		type = eleve.getType();
		classe = eleve.getClasse();
	}
	/**
	 * Convertir le java en json
	 * @return idEleve
	 */
	public int getIdEleve() {
		return idEleve;
	}
	/**
	 * Convertit le json en java
	 * @param idEleve
	 */
	public void setIdEleve(int idEleve) {
		this.idEleve = idEleve;
	}
	/**
	 * Convertir le java en json
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * Convertit le json en java
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * Convertir le java en json
	 * @return prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * Convertit le json en java
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * Convertir le java en json
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * Convertit le json en java
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * Convertir le java en json
	 * @return type
	 */
	public int getType() {
		return type;
	}
	/**
	 * Convertit le json en java
	 * @param type
	 */
	public void setType(int type) {
		this.type = type;
	}
	/**
	 * Convertir le java en json
	 * @return classe
	 */
	public int getClasse() {
		return classe;
	}
	/**
	 * Convertit le json en java
	 * @param classe
	 */
	public void setClasse(int classe) {
		this.classe = classe;
	}
}
