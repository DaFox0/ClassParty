package fr.classparty.manager;

import java.util.List;

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
		eleve.setClasse(e.getClasse());
		eleve.setType(e.getType());
		eleveList.add(eleve);
		return eleve;
	}

}
