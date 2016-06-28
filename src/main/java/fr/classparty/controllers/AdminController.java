package fr.classparty.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fr.classparty.manager.ClassPartyManagerImpl;
import fr.classparty.manager.IClassPartyManager;
import fr.classparty.models.Eleve;
import fr.classparty.models.Classe;

@Controller
@RequestMapping("/admin")
public class AdminController {
	private IClassPartyManager metier = new ClassPartyManagerImpl();
	
	/**
	 * Affiche la partie admin
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView admin() throws Exception {
		ModelAndView model = new ModelAndView("admin");
		return model;
	}	

	/**
	 * Affiche la partie eleve d'admin
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/eleve", method = RequestMethod.GET)
	public ModelAndView eleve() throws Exception {
		ModelAndView model = new ModelAndView("eleve");
		model.addObject("eleve", new Eleve());
		model.addObject("eleves", metier.listerEleve());
		return model;
	}	
	
	/**
	 * Affiche la partie moderateur d'admin
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/moderateur", method = RequestMethod.GET)
	public ModelAndView moderateur() throws Exception {
		ModelAndView model = new ModelAndView("moderateur");
		model.addObject("eleve", new Eleve());
		model.addObject("eleves", metier.listerEleveModerateur());
		return model;
	}
	
	@RequestMapping(value = "/showEleveForm", method = RequestMethod.GET)
	public ModelAndView showEleveForm() {
		return new ModelAndView("createEleve", "eleve", new Eleve());
	}
	
	
	@RequestMapping(value = "/addEleve", method = RequestMethod.POST)
	public ModelAndView addEleve(@ModelAttribute Eleve eleve) {
		ModelAndView model = new ModelAndView("createEleve");
		return model;
	}
	
	/**
	 * Permet la suppression d'un eleve
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/deleteEleve")
	public String deleteELeve(int idEle, Model model) throws Exception {
		metier.supprimerEleve(idEle);
		model.addAttribute("eleve", new Eleve());   
		model.addAttribute("eleves", metier.listerEleve());
		return "eleve";
	}	
	
	/**
	 * Permet l'affichage de l'eleve séléctionné
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/editEleve")
	public String editELeve(int idEle, Model model) throws Exception {
		Eleve e = metier.getEleve(idEle);
		model.addAttribute("editedEleve", e);   
		model.addAttribute("eleve", e);   
		return "updateEleve";
	}	
	
	/**
	 * Permet la modification d'un eleve
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/updateEleve")
	public String updateEleve(int idEle, Model model) throws Exception {
		Eleve e = metier.getEleve(idEle);
		e.setNom("toto");
		metier.modifierEleve(e);
		model.addAttribute("eleve", e);   
		model.addAttribute("eleves", metier.listerEleve());
		return "eleve";
	}	
}
