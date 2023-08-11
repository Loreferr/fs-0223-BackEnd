package com.epicode.Spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.Spring.classes.Utente;
import com.epicode.Spring.repository.UtenteRepo;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UtenteService {
	@Autowired
	UtenteRepo repo;

	@Autowired
	@Qualifier("customUtente")
	private ObjectProvider<Utente> customUserProvider;

	@Autowired
	@Qualifier("fakeUtente")
	private ObjectProvider<Utente> contactProvider;

	public Utente createCustomUser(String username, String nomecompleto, String email) {
		return customUserProvider.getObject().builder().username(username).nomeCompleto(nomecompleto).email(email)
				.build();
	}

	public void createFakeUtente() {
		Utente c = contactProvider.getObject();
		repo.save(c);
	}

	public Utente saveUtente(Utente user) {
		System.out.println("Utente:" + user.getUsername() + "Creato!");
		return repo.save(user);

	}

	public Utente updateUtente(Long id, Utente utente) {
		if (!repo.existsById(id)) {
			throw new EntityNotFoundException("Contact not exists!!!");
		}
		if (id != utente.getId()) {
			throw new EntityNotFoundException("Id and ContactID do not match!");
		}
		return repo.save(utente);

//		Contact c = getContactsByID(id);
//		if(c.getId() == contact.getId()) {
//			return  contactRepo.save(contact);
//		}
//		throw new Exception("Id and contact do not match");
	}

	public void removeUtente(Utente u) {
		repo.delete(u);
		System.out.println("Utente:" + u.getUsername() + " eliminato dal DB!!!");
	}

	public Optional<Utente> findUtentebyId(Long id) {
		System.out.println("Utente Trovato: " + repo.findById(id));
		return repo.findById(id);

	}

	public List<Utente> getAllContacts() {
		return (List<Utente>) repo.findAll();
	}

	public String removeContactByID(Long id) {

		repo.deleteById(id);

		return "Contact deleted!!!";
	}
}
