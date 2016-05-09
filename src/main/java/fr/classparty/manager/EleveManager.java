package fr.classparty.manager;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import fr.classparty.models.Eleve;

public class EleveManager {
	private static List<Eleve> eleveList;
	 
	public static List<Eleve> getEleveList() {
		return eleveList;
	}

	public Eleve addEleve(Eleve e){
		Eleve eleve = new Eleve();
		eleve.setNom(e.getNom());
		eleve.setPrenom(e.getPrenom());
		eleve.setDateNaissance(e.getDateNaissance());
		eleveList.add(eleve);
		return eleve;
	}
	
	public boolean loginEleve(Eleve e){
		Eleve eleve = new Eleve();
		eleve.setNom(e.getNom());
		eleve.setPrenom(e.getPrenom());
		eleve.setDateNaissance(e.getDateNaissance());

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		EntityManager entityManager = emf.createEntityManager();
		
		int id = eleve.getIdEleve();
		Eleve el =  entityManager.find(fr.classparty.models.Eleve.class, id) ;
		List<Eleve> liste = entityManager.createQuery( "SELECT login, password FROM Eleve e").getResultList();
		
		return true;
	}

}
