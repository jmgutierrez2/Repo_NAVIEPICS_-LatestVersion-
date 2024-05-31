package com.naviepics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naviepics.model.MySQL.Tipo_Vehiculo;
import com.naviepics.repo.MySQL.Tipo_Vehiculo_Repo;

@Service
public class Tipo_Vehiculo_ServiceImpl implements Tipo_Vehiculo_Service{

	@Autowired
	private Tipo_Vehiculo_Repo repositorio;

	@Override
	public List<Tipo_Vehiculo> listarTipo_Vehiculo() {
		return repositorio.findAll();
	}

}
