package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Classes.User;
import com.example.demo.Service.PrenotationService;
import com.example.demo.Service.UserService;

@RestController
@RequestMapping("/prenotation")
public class PrenotationController {

	@Autowired
	PrenotationService PService;

	@Autowired
	UserService UService;

	@GetMapping("/info")
	public @ResponseBody String getPrenotationInfo() {
		return "Info Prenotazione tu madre quella vacca";
	}

	@GetMapping("/users")
	public ResponseEntity<List<User>> getAll() {
		List<User> listaContatti = UService.getAllContacts();
		ResponseEntity<List<User>> resp = new ResponseEntity<List<User>>(listaContatti, HttpStatus.OK);
		return resp;
	}
}