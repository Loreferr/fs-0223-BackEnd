package com.epicode.Spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.Spring.classes.Smartphone;

@Repository
public interface SmartphoneRepo extends CrudRepository<Smartphone, Long> {

}
