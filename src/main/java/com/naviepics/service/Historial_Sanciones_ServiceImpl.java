package com.naviepics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naviepics.model.MySQL.Historial_Sanciones;
import com.naviepics.repo.MySQL.Historial_Sanciones_Repo;

@Service
public class Historial_Sanciones_ServiceImpl implements Historial_Sanciones_Service{

	@Autowired
	private Historial_Sanciones_Repo repositorio;
	
	@Override
	public List<Historial_Sanciones> listarHistorial_Sanciones() {
		return repositorio.findAll();
	}

}
