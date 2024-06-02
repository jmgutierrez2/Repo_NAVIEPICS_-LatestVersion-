package com.naviepics.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naviepics.model.MySQL.Vehiculo;
import com.naviepics.repo.MySQL.Vehiculo_Repo;
import com.naviepics.service.Vehiculo_Service;

@Service
public class Vehiculo_ServiceImpl implements Vehiculo_Service{

	@Autowired
	private Vehiculo_Repo repositorio;
	
	@Override
	public List<Vehiculo> listarVehiculo() {
		return repositorio.findAll();
	}

}