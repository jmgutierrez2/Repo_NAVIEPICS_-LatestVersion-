package com.naviepics.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.naviepics.model.MySQL.Entradas;
import com.naviepics.model.Oracle.Equipos_Estacionamiento;
import com.naviepics.repo.MySQL.Entradas_Repo;
import com.naviepics.repo.Oracle.Equipos_Estacionamiento_Repo;

@Service
public class Equipos_Estacionamiento_ServiceImpl {

	@Autowired
	private Entradas_Repo repo;
	
	@Transactional
	public void registrar(Entradas t) {
		repo.save(t);
	}
	@Transactional
	public Optional<Entradas> mostrarUno(long id) {
		return repo.findById(id);
	}
	@Transactional
	public List<Entradas> mostrarTodo(){
		return repo.findAll();
	}
	@Transactional
	public Entradas actualizar(Entradas d) {
		return repo.save(d);
	}
	@Transactional
	public void eliminar(long id) {
		repo.deleteById(id);
	}
}
