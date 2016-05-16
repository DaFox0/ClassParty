package fr.classparty.manager;

import java.util.List;

import fr.classparty.models.Classe;
import fr.classparty.models.Commentaire;
import fr.classparty.models.Eleve;
import fr.classparty.models.Fichier;
import fr.classparty.models.Photo;
import fr.classparty.models.TypeUtilisateur;

public interface IClassPartyManager {
	//Eleve
	public Eleve selectionnerEleve(int idEleve);
	public void modifierEleve(Eleve e);
	public void supprimerEleve(Eleve e);
	public List<Eleve> listerEleve();
	public List<Eleve> eleveParNom(String nom);
	public List<Eleve> eleveParPrenom(String prenom);
	public List<Eleve> eleveParClasse(String niveau, int annee);
	public void enregistrerEleve(Eleve e);
	
	//Classe
	public void ajouterClasse(Classe c);
	public void supprimerClasse(Classe c);
	public void modifierClasse(Classe c);
	public List<Classe> listerClasseParNiveau(String niveau);
	public List<Classe> listerClasseParAnnee(int Annee);
	
	//Fichier
	public void ajouterFichier(Fichier f);
	public void supprimerFichier(Fichier f);
	public void modifierFichier(Fichier f);
	public List<Fichier> listerFichier();
	public List<Fichier> listerFichierParClasse(int idClasse);
	public List<Fichier> listerFichierParEleve(int idEleve);
	
	//Photo
	public void ajouterPhoto(Photo p);
	public void supprimerPhoto(Photo p);
	public void modifierPhoto(Photo p);
	public List<Fichier> listerPhoto();
	public List<Fichier> listerPhotoParEleve(int idEleve);
	
	//Commentaire
	public Commentaire ajouterCommentaire(Photo p, Eleve e);
	public void supprimerCommentaire(Commentaire c);
	public void modifierCommentaire(Commentaire c);
	public List<Commentaire> listerCommentaireParPhoto(int idPhoto);
	public List<Commentaire> listerCommentaireParEleve(int idEleve);
	
	//TypeUtilisateur
	public List<TypeUtilisateur> listerTypeUtilisateur();
	
}
