package com.naviepics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naviepics.model.Oracle.Mantenimiento_Equipos;
import com.naviepics.repo.Oracle.Mantenimiento_Equipos_Repo;

@Service
public class Mantenimiento_Equipos_ServiceImpl implements Mantenimiento_Equipos_Service{

	@Autowired
	private Mantenimiento_Equipos_Repo repositorio;
	
	@Override
	public List<Mantenimiento_Equipos> listarMantenimiento_Equipos() {
		return repositorio.findAll();
	}

}
