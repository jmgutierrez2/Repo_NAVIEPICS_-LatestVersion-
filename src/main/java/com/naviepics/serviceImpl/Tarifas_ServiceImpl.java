package com.naviepics.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naviepics.model.MySQL.Tarifas;
import com.naviepics.repo.MySQL.Tarifas_Repo;
import com.naviepics.service.Tarifas_Service;

@Service
public class Tarifas_ServiceImpl implements Tarifas_Service{

	@Autowired
	private Tarifas_Repo repositorio;

	@Override
	public List<Tarifas> listarTarifas() {
		return repositorio.findAll();
	}

}
