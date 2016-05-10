package fr.classparty.models;



import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.eclipse.persistence.jpa.jpql.parser.DateTime;

@Entity
public class Commentaire {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCommentaire;
	@ManyToOne
	private Eleve eleve;
	private Timestamp heure;
	
	public Commentaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commentaire(int idCommentaire, Timestamp heure) {
		this.idCommentaire = idCommentaire;
		this.heure = heure;
	}
	public int getIdCommentaire() {
		return idCommentaire;
	}
	public void setIdCommentaire(int idCommentaire) {
		this.idCommentaire = idCommentaire;
	}
	public Timestamp getHeure() {
		return heure;
	}
	public void setHeure(Timestamp heure) {
		this.heure = heure;
	}
}
