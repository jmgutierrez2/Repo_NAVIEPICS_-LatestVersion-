package com.naviepics.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naviepics.model.MySQL.Entradas;
import com.naviepics.repo.MySQL.Entradas_Repo;
import com.naviepics.service.Entradas_Service;
@Service
public class Entradas_Service_Impl implements Entradas_Service{
	@Autowired
	private Entradas_Repo repo;

	@Override
	public List<Entradas> findAll() {
		return (List<Entradas>)repo.findAll();
	}

	@Override
	public Optional<Entradas> findOne(Long id) {
		return repo.findById(id);
	}

	@Override
	public Entradas saveOrUpdate(Entradas entrada) {
		return repo.save(entrada);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
