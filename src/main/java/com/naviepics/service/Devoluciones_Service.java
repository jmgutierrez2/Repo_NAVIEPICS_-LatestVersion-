package com.naviepics.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.naviepics.model.MySQL.Devoluciones;
import com.naviepics.repo.MySQL.Devoluciones_Repo;

public class Devoluciones_Service {

	@Autowired
	private Devoluciones_Repo repo;
	
	@Transactional
	public void registrar(Devoluciones t) {
		repo.save(t);
	}
	@Transactional
	public Optional<Devoluciones> mostrarUno(long id) {
		return repo.findById(id);
	}
	@Transactional
	public List<Devoluciones> mostrarTodo(){
		return repo.findAll();
	}
	@Transactional
	public Devoluciones actualizar(Devoluciones d) {
		return repo.save(d);
	}
	@Transactional
	public void eliminar(long id) {
		repo.deleteById(id);
	}
	
}
