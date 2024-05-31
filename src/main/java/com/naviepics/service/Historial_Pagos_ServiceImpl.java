package com.naviepics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naviepics.model.MySQL.Historial_Pagos;
import com.naviepics.repo.MySQL.Historial_Pagos_Repo;

@Service
public class Historial_Pagos_ServiceImpl implements Historial_Pagos_Service{

	@Autowired
	private Historial_Pagos_Repo repositorio;

	@Override
	public List<Historial_Pagos> listarHistorial_Pagos() {
		return repositorio.findAll();
	}

}
