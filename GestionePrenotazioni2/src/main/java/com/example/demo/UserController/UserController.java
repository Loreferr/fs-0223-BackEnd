package com.example.demo.UserController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Classes.User;
import com.example.demo.Service.UserService;

@Controller
public class UserController {

	private final UserService us;

	@Autowired
	public UserController(UserService us) {
		this.us = us;
	}

	@GetMapping("/")
	public String getHome() {
		return "index";
	}

	@GetMapping("/rubrica")
	public ModelAndView getUsers() {
		List<User> listaContatti = us.getAllContacts();
		// System.out.println(listaContatti.size());
		// listaContatti.forEach(c -> System.out.println(c));
		ModelAndView model = new ModelAndView("UserPage"); // nome della pagina html che voglio richiamare
		model.addObject("lista", listaContatti);
		return model;
	}

}
