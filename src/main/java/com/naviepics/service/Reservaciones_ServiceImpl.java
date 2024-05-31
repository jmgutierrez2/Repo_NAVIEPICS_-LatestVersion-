package com.naviepics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naviepics.model.MySQL.Reservaciones;
import com.naviepics.repo.MySQL.Reservaciones_Repo;

@Service
public class Reservaciones_ServiceImpl implements Reservaciones_Service{

	@Autowired
	private Reservaciones_Repo repositorio;

	@Override
	public List<Reservaciones> listarReservaciones() {
		return repositorio.findAll();
	}

}
