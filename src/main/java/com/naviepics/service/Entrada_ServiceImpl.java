package com.naviepics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naviepics.model.MySQL.Entradas;
import com.naviepics.repo.MySQL.Entradas_Repo;

@Service
public class Entrada_ServiceImpl implements Entrada_Service{

	@Autowired
	private Entradas_Repo repositorio;
	
	@Override
	public List<Entradas> listarEntradas() {
		return repositorio.findAll();
	}

}

