package com.example.demo.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Classes.User;

@Repository
public interface UserRepo extends CrudRepository<User, String> {
	@Query("SELECT u FROM User u WHERE u.Username = :username")
	public User findByUsername(@Param("username") String username);

}
