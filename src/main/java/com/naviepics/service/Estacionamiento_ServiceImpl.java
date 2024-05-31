package com.naviepics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naviepics.model.MySQL.Estacionamiento;
import com.naviepics.repo.MySQL.Estacionamiento_Repo;

@Service
public class Estacionamiento_ServiceImpl implements Estacionamiento_Service{

	@Autowired
	private Estacionamiento_Repo repositorio;

	@Override
	public List<Estacionamiento> listarEstacionamiento() {
		return repositorio.findAll();
	}

}
