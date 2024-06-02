package com.naviepics.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naviepics.model.MySQL.Espacios;
import com.naviepics.repo.MySQL.Espacio_Repo;
import com.naviepics.service.Espacios_Service;

@Service
public class Espacios_ServiceImpl implements Espacios_Service{

	@Autowired
	private Espacio_Repo repositorio;
	
	@Override
	public List<Espacios> listarEspacios() {
		return repositorio.findAll();
	}

}
