package com.naviepics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naviepics.model.Oracle.Equipos_Estacionamiento;
import com.naviepics.repo.Oracle.Equipos_Estacionamiento_Repo;

@Service
public class Equipos_Estacionamiento_ServiceImpl implements Equipos_Estacionamiento_Service{

	@Autowired
	private Equipos_Estacionamiento_Repo repositorio;
	
	@Override
	public List<Equipos_Estacionamiento> listarEquipos_Estacionamiento() {
		return repositorio.findAll();
	}

}
