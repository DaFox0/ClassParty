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
		Query req = entityManager.createQuery("select * from Eleve e");
		return req.getResultList();
	}

	@Override
	public List<Eleve> eleveParNom(String nom) {
		Query req=entityManager.createQuery("select * from Eleve e WHERE nom = "+nom);
		return req.getResultList();
	}

	@Override
	public List<Eleve> eleveParPrenom(String prenom) {
		Query req=entityManager.createQuery("select * from Eleve e WHERE prenom = "+prenom);
		return req.getResultList();
	}

	@Override
	public List<Eleve> eleveParClasse(String niveau, int annee) {
		Query req = entityManager.createQuery("select * from Eleve e inner join Classe c on c.idclasse = e.classe_idclasse where c.niveau = "+niveau+" and c.annee ="+annee);
		return req.getResultList();
	}

	@Override
	public void enregistrerEleve(Eleve e) {
		entityManager.persist(e);
	}

	@Override
	public void ajouterClasse(Classe c) {
		entityManager.persist(c);
		
	}

	@Override
	public void supprimerClasse(Classe c) {
		entityManager.remove(c);
		
	}

	@Override
	public void modifierClasse(Classe c) {
		entityManager.merge(c);
		
	}

	@Override
	public List<Classe> listerClasseParNiveau(String niveau) {
		Query req = entityManager.createQuery("select * from Classe c WHERE c.niveau ="+niveau);
		return req.getResultList();
	}

	@Override
	public List<Classe> listerClasseParAnnee(int annee) {
		Query req = entityManager.createQuery("select * from Classe c WHERE c.annee ="+annee);
		return req.getResultList();
	}

	@Override
	public void ajouterFichier(Fichier f) {
		entityManager.persist(f);
	}

	@Override
	public void supprimerFichier(Fichier f) {
		entityManager.remove(f);
		
	}

	@Override
	public void modifierFichier(Fichier f) {
		entityManager.merge(f);
		
	}

	@Override
	public List<Fichier> listerFichier() {
		Query req = entityManager.createQuery("select * from Fichier f");
		return req.getResultList();
	}

	@Override
	public List<Fichier> listerFichierParClasse(int idClasse) {
		Query req = entityManager.createQuery("select * from Fichier f JOIN fichier_classe fc on f.idfichier = fc.classes_idfichier WHERE fc.idclasse ="+idClasse);
		return req.getResultList();
	}

	@Override
	public List<Fichier> listerFichierParEleve(int idEleve) {
		Query req = entityManager.createQuery("select * from Fichier f WHERE f.eleve_ideleve ="+idEleve);
		return req.getResultList();
	}

	@Override
	public void ajouterPhoto(Photo p) {
		entityManager.persist(p);
		
	}

	@Override
	public void supprimerPhoto(Photo p) {
		entityManager.remove(p);
		
	}

	@Override
	public void modifierPhoto(Photo p) {
		entityManager.merge(p);
		
	}

	@Override
	public List<Fichier> listerPhoto() {
		Query req = entityManager.createQuery("select * from Photo p");
		return req.getResultList();
	}

	@Override
	public List<Fichier> listerPhotoParEleve(int idEleve) {
		Query req = entityManager.createQuery("select * from Photo p where p.eleve_ideleve ="+idEleve);
		return req.getResultList();
	}

	@Override
	public Commentaire ajouterCommentaire(Photo p, Eleve e) {
		entityManager.persist(e);
		Commentaire com = new Commentaire();
		com.setEleve(e);
		com.setPhoto(p);
		entityManager.persist(com);
		return com;
	}

	@Override
	public void supprimerCommentaire(Commentaire c) {
		entityManager.remove(c);
		
	}

	@Override
	public void modifierCommentaire(Commentaire c) {
		entityManager.merge(c);
		
	}

	@Override
	public List<Commentaire> listerCommentaireParPhoto(int idPhoto) {
		Query req = entityManager.createQuery("select * from Commentaire c WHERE c.photo_idphoto ="+idPhoto);
		return req.getResultList();
	}

	@Override
	public List<Commentaire> listerCommentaireParEleve(int idEleve) {
		Query req = entityManager.createQuery("select * from Commentaire c WHERE e.eleve_ideleve ="+idEleve);
		return req.getResultList();
	}

	@Override
	public List<TypeUtilisateur> listerTypeUtilisateur() {
		Query req = entityManager.createQuery("select * from typeutilisateur tu");
		return req.getResultList();
	}
}
