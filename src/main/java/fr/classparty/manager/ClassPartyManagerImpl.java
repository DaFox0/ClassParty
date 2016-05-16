package fr.classparty.manager;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import fr.classparty.models.Classe;
import fr.classparty.models.Commentaire;
import fr.classparty.models.Eleve;
import fr.classparty.models.Fichier;
import fr.classparty.models.Photo;
import fr.classparty.models.TypeUtilisateur;

public class ClassPartyManagerImpl implements IClassPartyManager{
	
	EntityManager entityManager;
	
	public ClassPartyManagerImpl() {
		super();
		// TODO Auto-generated constructor stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		entityManager = emf.createEntityManager();
	}

	@Override
	public Eleve selectionnerEleve(int idEleve) {
		return entityManager.find(Eleve.class,idEleve);
	}

	@Override
	public void modifierEleve(Eleve e) {
		entityManager.merge(e);
	}

	@Override
	public void supprimerEleve(Eleve e) {
		entityManager.remove(e);
	}

	@Override
	public List<Eleve> listerEleve() {
		Query req=entityManager.createQuery("select e from Eleve e");
		return req.getResultList();
	}

	@Override
	public List<Eleve> eleveParNom(String nom) {
		Query req=entityManager.createQuery("select e from Eleve e WHERE nom = "+nom);
		return req.getResultList();
	}

	@Override
	public List<Eleve> eleveParPrenom(String prenom) {
		Query req=entityManager.createQuery("select e from Eleve e WHERE prenom = "+prenom);
		return req.getResultList();
	}

	@Override
	public List<Eleve> eleveParClasse(String niveau, int annee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void enregistrerEleve(Eleve e) {
		entityManager.persist(e);
	}

	@Override
	public void ajouterClasse(Classe c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerClasse(Classe c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierClasse(Classe c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Classe> listerClasseParNiveau(String niveau) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Classe> listerClasseParAnnee(int Annee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouterFichier(Fichier f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerFichier(Fichier f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierFichier(Fichier f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Fichier> listerFichier() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fichier> listerFichierParClasse(int idClasse) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fichier> listerFichierParEleve(int idEleve) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouterPhoto(Photo p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerPhoto(Photo p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierPhoto(Photo p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Fichier> listerPhoto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fichier> listerPhotoParEleve(int idEleve) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Commentaire ajouterCommentaire(Photo p, Eleve e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerCommentaire(Commentaire c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierCommentaire(Commentaire c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Commentaire> listerCommentaireParPhoto(int idPhoto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Commentaire> listerCommentaireParEleve(int idEleve) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TypeUtilisateur> listerTypeUtilisateur() {
		// TODO Auto-generated method stub
		return null;
	}
}
