package com.naviepics.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.naviepics.model.MySQL.Espacios;
import com.naviepics.repo.MySQL.Espacio_Repo;
import com.naviepics.service.Espacios_Service;

@Service
public class Espacios_ServiceImpl implements Espacios_Service{

	@Autowired
	private Espacio_Repo repo;

	@Transactional
	public List<Espacios> findAll() {
        return (List<Espacios>)repo.findAll();
	}

	@Transactional
	public Optional<Espacios> findOne(Long id) {
		return repo.findById(id);
	}

	@Transactional
	public Espacios saveOrUpdate(Espacios administrador) {
		return repo.save(administrador);
	}

	@Transactional
	public void delete(Long id) {
		repo.deleteById(id);
	}
}
