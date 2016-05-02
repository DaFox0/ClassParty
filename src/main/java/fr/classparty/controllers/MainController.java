package fr.classparty.controllers;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.apache.commons.lang3.StringUtils;

@Controller
public class MainController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView model = new ModelAndView("login");
		
		if(controleLogin("ara123","azerty")){
			model.setViewName("accueil");
			model.addObject("message", "Hello Spring MVC Framework!");
		}else{
			model.setViewName("login");
			model.addObject("messageErreur", "Mot de passe incorrect");
		}
		return model;
	}
	
	private boolean controleLogin(String user, String password){
		if (StringUtils.isNotEmpty(user) && StringUtils.isNotEmpty(password)){
			byte[] passwordByte = password.getBytes(StandardCharsets.UTF_8);
			String encodedPass = Base64.getEncoder().encodeToString(passwordByte);
			boolean loginOk = user.equals("todo") && encodedPass.equals("todo pass crypted");
			return loginOk;
		}
		return false;
	}
}
