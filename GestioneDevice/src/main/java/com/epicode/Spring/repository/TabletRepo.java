package com.epicode.Spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.Spring.classes.Device;

@Repository
public interface TabletRepo extends CrudRepository<Device, Long> {

}
