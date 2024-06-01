package com.naviepics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naviepics.model.MySQL.Salida;
import com.naviepics.repo.MySQL.Salida_Repo;

@Service
public class Salida_ServiceImpl implements Salida_Service{

	@Autowired
	private Salida_Repo repositorio;

	@Override
	public List<Salida> listarSalida() {
		return repositorio.findAll();
	}

}
