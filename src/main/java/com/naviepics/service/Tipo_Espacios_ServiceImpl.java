package com.naviepics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naviepics.model.MySQL.Tipo_Espacios;
import com.naviepics.repo.MySQL.Tipo_Espacios_Repo;

@Service
public class Tipo_Espacios_ServiceImpl implements Tipo_Espacios_Service{

	@Autowired
	private Tipo_Espacios_Repo repositorio;

	@Override
	public List<Tipo_Espacios> listarTipo_Espacios() {
		return repositorio.findAll();
	}

}
