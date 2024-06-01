package com.naviepics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naviepics.model.MySQL.Espacios;
import com.naviepics.repo.MySQL.Espacio_Repo;

@Service
public class Espacios_ServiceImpl implements Espacios_Service{

	@Autowired
	private Espacio_Repo repositorio;
	
	@Override
	public List<Espacios> listarEspacios() {
		return repositorio.findAll();
	}

}
