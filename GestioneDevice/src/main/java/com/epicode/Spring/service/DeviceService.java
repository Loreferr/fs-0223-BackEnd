package com.epicode.Spring.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.Spring.classes.Laptop;
import com.epicode.Spring.classes.Smartphone;
import com.epicode.Spring.classes.Status;
import com.epicode.Spring.classes.Tablet;
import com.epicode.Spring.classes.Utente;
import com.epicode.Spring.repository.LaptopRepo;
import com.epicode.Spring.repository.SmartphoneRepo;
import com.epicode.Spring.repository.TabletRepo;

@Service
public class DeviceService {
	@Autowired
	SmartphoneRepo Srepo;
	@Autowired
	LaptopRepo Lrepo;

	@Autowired
	TabletRepo Trepo;

	@Autowired
	@Qualifier("customSmartphone")
	private ObjectProvider<Smartphone> customSmartphoneProvider;

	@Autowired
	@Qualifier("customLaptop")
	private ObjectProvider<Laptop> customLaptopProvider;

	@Autowired
	@Qualifier("customSmartphone")
	private ObjectProvider<Tablet> customTabletProvider;

	public void createCustomSmartphone(Utente utente, Status status) {
		Smartphone S = customSmartphoneProvider.getObject();
		S.setUtente(utente);
		S.setStatus(status);
		Srepo.save(S);
	}

	public void createCustomLaptop(Utente utente, Status status) {
		Laptop L = customLaptopProvider.getObject();
		L.setUtente(utente);
		L.setStatus(status);
		Lrepo.save(L);
	}

	public void createCustomTablet(Utente utente, Status status) {
		Tablet T = customTabletProvider.getObject();
		T.setUtente(utente);
		T.setStatus(status);
		Trepo.save(T);
	}

//	public List<Device> getAllDevices() {
//		return (List<Device>) repo.findAll();
//	}
}
