package fr.classparty.controllers;

import javax.print.attribute.standard.PrinterLocation;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import fr.classparty.manager.ClassPartyManagerImpl;
import fr.classparty.manager.IClassPartyManager;
import fr.classparty.models.Eleve;
import fr.classparty.models.Photo;

@Controller
@SessionAttributes("activeSession")
public class MainController {
	static final private String CLASSPARTY = "ClassParty - ";
	static final private String TITRE_CONNEXION = CLASSPARTY + "Connexion";
	static final private String TITRE_ACCUEIL = CLASSPARTY + "Accueil";
	private IClassPartyManager metier = new ClassPartyManagerImpl();
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView start(){
		ModelAndView model = new ModelAndView("login");
		model.addObject("eleve", new Eleve());
		model.addObject("titre",TITRE_CONNEXION);
		return model;
	}
	
	@RequestMapping(value = "/accueil", method = RequestMethod.GET)
	public ModelAndView accueil(Eleve eleve){
		ModelAndView model = new ModelAndView("accueil");
		if(eleve == null){
			model = start();
		}else{
			System.out.println(eleve);
			model.addObject("activeSession", eleve);
			model.addObject("titre",TITRE_ACCUEIL);
		}
		return model;
	}
	
	/**
	 * Permet de se deconnecter
	 * @param status
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/logout")
	public ModelAndView logOut(SessionStatus status) throws Exception{
		status.setComplete();
		return start();
	}
	
	/**
	 * Affiche le tchat.
	 * A besoin d'être connecté
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/tchat", method = RequestMethod.GET)
	public ModelAndView dialogue() throws Exception {
		ModelAndView model = new ModelAndView("dialogue");
		return model;
	}
	
	/**
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/livre", method = RequestMethod.GET)
	public ModelAndView livre() throws Exception {
		ModelAndView model = new ModelAndView("livre_or");
		return model;
	}	

	/**
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/galerie", method = RequestMethod.GET)
	public ModelAndView galerie() throws Exception {
		ModelAndView model = new ModelAndView("galerie");
		model.addObject("photo", new Photo());
		return model;
	}
	
	/**
	 * Permet de se connecter en utilisant la methode controleLogin
	 * @param eleve
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute Eleve eleve) throws Exception {
		ModelAndView model = new ModelAndView("login");
		if(controleLogin(eleve.getLogin(),eleve.getPassword())){
			eleve = metier.selectionnerEleve(eleve.getLogin());
			System.out.println(eleve);
			model = accueil(eleve);
		}else{
			model.addObject("titre",TITRE_CONNEXION);
			model.addObject("eleve", new Eleve());
			model.addObject("messageErreur", "Identifiant incorrect.");
		}
		return model;
	}
	/**
	 * Verifie le pseudo et le mot de passe
	 * @param user
	 * @param password
	 * @return
	 */
	private boolean controleLogin(String user, String password){
		if (StringUtils.isNotEmpty(user) && StringUtils.isNotEmpty(password)){
			if(metier.connexion(user, password) > 0){
				return true;
			}
		}
		return false;
	}
}
