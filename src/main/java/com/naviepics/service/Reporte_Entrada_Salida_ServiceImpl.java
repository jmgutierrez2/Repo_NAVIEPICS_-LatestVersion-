package com.naviepics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naviepics.model.MySQL.Reporte_Entrada_Salida;
import com.naviepics.repo.MySQL.Reporte_Entrada_Salida_Repo;

@Service
public class Reporte_Entrada_Salida_ServiceImpl implements Reporte_Entrada_Salida_Service{
	
	@Autowired
	private Reporte_Entrada_Salida_Repo repositorio;

	@Override
	public List<Reporte_Entrada_Salida> listarReporte_Entrada_Salida() {
		return repositorio.findAll();
	}

}
