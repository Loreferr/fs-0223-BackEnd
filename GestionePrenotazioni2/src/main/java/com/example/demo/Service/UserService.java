package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.Classes.User;
import com.example.demo.Repository.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo repo;

	@Autowired
	@Qualifier("customUser")
	private ObjectProvider<User> customUserProvider;
	@Autowired
	@Qualifier("fakeUserBean")
	private ObjectProvider<User> contactProvider;

	public void createFakeContact() {
		User c = contactProvider.getObject();
		repo.save(c);
	}

	public List<User> getAllContacts() {
		return (List<User>) repo.findAll();
	}

	public User createCustomUser(String username, String nomecompleto, String email) {
		return customUserProvider.getObject().builder().Username(username).NomeCompleto(nomecompleto).Email(email)
				.build();
	}

	public void saveUser(User user) {
		repo.save(user);
		System.out.println("Utente:" + user.getUsername() + "Creato!");
	}

	public void updateUser(User user) {
		repo.save(user);
		System.out.println("Utente:" + user.getUsername() + " modificato nel DB!!!");
	}

	public void removeUser(User u) {
		repo.delete(u);
		System.out.println("Utente:" + u.getUsername() + " eliminato dal DB!!!");
	}

	public User findUser(String username) {
		System.out.println("Utente Trovato: " + repo.findByUsername(username));
		return repo.findByUsername(username);

	}
}
