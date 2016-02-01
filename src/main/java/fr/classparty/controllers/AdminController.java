package fr.classparty.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

import fr.classparty.dto.EleveDTO;
import fr.classparty.models.Eleve;

@Controller
@Component
public class AdminController {
	List<Eleve> eleves = new ArrayList<Eleve>(); 
	
	private AdminController(){
		Eleve antoine = new Eleve();
		antoine.setPrenom("Antoine");
		antoine.setNom("RAYNAUD");
		antoine.setAge(21);
		antoine.setType(2);
		eleves.add(antoine);
	}

	@RequestMapping(value = "/eleve", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<EleveDTO> getEleves() {
		ArrayList<EleveDTO> elevesDTO = new ArrayList<EleveDTO>();
		for (int i = 0; i < eleves.size(); i++) {
				EleveDTO c = new EleveDTO(eleves.get(i));
				elevesDTO.add(c);
			}
		return elevesDTO;
	}

}
