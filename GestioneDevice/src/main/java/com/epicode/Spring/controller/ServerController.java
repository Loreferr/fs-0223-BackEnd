package com.epicode.Spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.Spring.classes.Utente;
import com.epicode.Spring.service.UtenteService;

@RestController
@RequestMapping("/api")
public class ServerController {

	private UtenteService us;

	@Autowired
	public ServerController(UtenteService us) {
		this.us = us;
	}

	@GetMapping("/allusers")

	public ResponseEntity<List<Utente>> getAllUsers() {
		List<Utente> listaContatti = us.getAllContacts();
		ResponseEntity<List<Utente>> resp = new ResponseEntity<List<Utente>>(listaContatti, HttpStatus.OK);
		return resp;

	}

	@GetMapping("/allusers/{id}")
	public Optional<Utente> getRubrica(@PathVariable long id) {
		Optional<Utente> utente = us.findUtentebyId(id);
		System.out.println(utente);

		return utente;
	}

	@PostMapping("/allusers")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Utente> postUtente(@RequestBody Utente obj) {
		Utente utente = us.saveUtente(obj);
		System.out.println(obj);
		return new ResponseEntity<Utente>(utente, HttpStatus.OK);
	}

	@PutMapping("/allusers/{id}")
	public ResponseEntity<Utente> updateUtente(@PathVariable Long id, @RequestBody Utente u) {
		Utente ut = us.updateUtente(id, u);
		return new ResponseEntity<Utente>(ut, HttpStatus.OK);
	}

	@DeleteMapping("/allusers/{id}")
	public ResponseEntity<String> removeContact(@PathVariable Long id) {
		String msg = us.removeContactByID(id);
		return new ResponseEntity<String>(msg, HttpStatus.OK);

	}

//	@PostMapping("/alldevices")
//	public ResponseEntity<List<Device>> getAllDevices() {
//		List<Device> listaContatti = us.getAllContacts();
//		ResponseEntity<List<Utente>> resp = new ResponseEntity<List<Utente>>(listaContatti, HttpStatus.OK);
//		return resp;
//
//	}
}
