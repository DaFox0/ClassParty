package fr.classparty.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fr.classparty.manager.ClassPartyManagerImpl;
import fr.classparty.manager.IClassPartyManager;
import fr.classparty.models.Eleve;

@Controller
public class MainController {
	static final private String CLASSPARTY = "ClassParty - ";
	static final private String TITRE_CONNEXION = CLASSPARTY + "Connexion";
	static final private String TITRE_ACCUEIL = CLASSPARTY + "Accueil";
	private IClassPartyManager metier = new ClassPartyManagerImpl();
	
	//LOGIN
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView accueil(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView model = new ModelAndView("login");
		model.addObject("eleve", new Eleve());
		model.addObject("titre",TITRE_CONNEXION);
		return model;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute Eleve eleve,
			HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView model = new ModelAndView("login");
		if(controleLogin(eleve.getLogin(),eleve.getPassword())){
			model.setViewName("accueil");
			model.addObject("titre",TITRE_ACCUEIL);
		}else{
			model.addObject("titre",TITRE_CONNEXION);
			model.addObject("eleve", new Eleve());
			model.addObject("messageErreur", "Identifiant incorrect.");
		}
		return model;
	}
	
	private boolean controleLogin(String user, String password){
		if (StringUtils.isNotEmpty(user) && StringUtils.isNotEmpty(password)){
			if(metier.connexion(user, password) > 0){
				return true;
			}
		}
		return false;
	}
}
