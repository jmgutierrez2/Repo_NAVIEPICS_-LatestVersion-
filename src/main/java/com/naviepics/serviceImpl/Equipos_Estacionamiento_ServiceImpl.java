package com.naviepics.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.naviepics.model.Oracle.Equipos_Estacionamiento;
import com.naviepics.repo.Oracle.Equipos_Estacionamiento_Repo;
import com.naviepics.service.Equipos_Estacionamiento_Service;
@Service
public class Equipos_Estacionamiento_ServiceImpl implements Equipos_Estacionamiento_Service {

	@Autowired
	private Equipos_Estacionamiento_Repo repo;

	public List<Equipos_Estacionamiento> findAll() {
        return (List<Equipos_Estacionamiento>)repo.findAll();
	}

	public Optional<Equipos_Estacionamiento> findOne(Long id) {
		return repo.findById(id);
	}

	public Equipos_Estacionamiento saveOrUpdate(Equipos_Estacionamiento e) {
		return repo.save(e);
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}
	
}
