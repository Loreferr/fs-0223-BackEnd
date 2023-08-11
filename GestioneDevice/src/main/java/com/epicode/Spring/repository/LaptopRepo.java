package com.epicode.Spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.Spring.classes.Laptop;

@Repository
public interface LaptopRepo extends CrudRepository<Laptop, Long> {

}
