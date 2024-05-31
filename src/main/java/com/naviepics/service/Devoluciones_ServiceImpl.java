package com.naviepics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naviepics.model.MySQL.Devoluciones;
import com.naviepics.repo.MySQL.Devoluciones_Repo;

@Service
public class Devoluciones_ServiceImpl implements Devoluciones_Service{

	@Autowired
	private Devoluciones_Repo repositorio;
	
	@Override
	public List<Devoluciones> listarDevoluciones() {
		return repositorio.findAll();
	}

}
