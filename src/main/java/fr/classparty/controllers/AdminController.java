package fr.classparty.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fr.classparty.manager.EleveManager;
import fr.classparty.models.Eleve;

@Controller
@Component
public class AdminController {
	List<Eleve> eleves = new ArrayList<Eleve>(); 
	
	private AdminController(){
		Eleve antoine = new Eleve();
		antoine.setPrenom("Antoine");
		antoine.setNom("RAYNAUD");
		eleves.add(antoine);
	}
	@RequestMapping(value = "/showEleveForm", method = RequestMethod.GET)
	public ModelAndView showEleveForm() {
		return new ModelAndView("showEleveForm", "eleve", new Eleve());
	}
	
	
	@RequestMapping(value = "/addEleve", method = RequestMethod.POST)
	public ModelAndView addEleve(@ModelAttribute Eleve eleve) {
		ModelAndView model = new ModelAndView("showEleveForm");
		EleveManager eleveManager = new EleveManager();
		eleveManager.addEleve(eleve);
		return model;
	}

}
