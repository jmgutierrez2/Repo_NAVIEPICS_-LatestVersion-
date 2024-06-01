package com.naviepics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naviepics.model.MySQL.Recibo;
import com.naviepics.repo.MySQL.Recibo_Repo;

@Service
public class Recibo_ServiceImpl implements Recibo_Service{
	
	@Autowired
	private Recibo_Repo repositorio;

	@Override
	public List<Recibo> listarRecibo() {
		return repositorio.findAll();
	}

}
