package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.classparty.models.Eleve;
import fr.classparty.models.TypeUtilisateur;
/**
 * Test de la création d'un eleve
 * @author adeclerck
 *
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("Création de la base et d'un utilisateur.");
		// Appelle le constructeur eleve
		TypeUtilisateur type = new TypeUtilisateur();
		type.setIdTypeUtilisateur(3);
		Eleve eleve = new Eleve("Hoze", "Thomas", "17/01/1994", "picouze", "12345", type);
		
		//Appelle la persistence qui permet de se connecter à la base de donnée 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		EntityManager entityManager = emf.createEntityManager();
		
		
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		//Insert l'eleve en base
		entityManager.persist(eleve);
		
		tx.commit();
		//On selectionne l'eleve dans la base
		int id = eleve.getIdEleve();
		Eleve e =  entityManager.find(fr.classparty.models.Eleve.class, id) ;
		List<Eleve> liste = entityManager.createQuery( "SELECT e FROM Eleve e ").getResultList();
		System.out.println("Base créée.");
	}

}
