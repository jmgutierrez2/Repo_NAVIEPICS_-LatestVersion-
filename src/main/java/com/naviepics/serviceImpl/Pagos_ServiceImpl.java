package com.naviepics.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naviepics.model.MySQL.Pagos;
import com.naviepics.repo.MySQL.Pagos_Repo;
import com.naviepics.service.Pagos_Service;

@Service
public class Pagos_ServiceImpl implements Pagos_Service{

	@Autowired
	private Pagos_Repo repositorio;
	
	@Override
	public List<Pagos> listarPagos() {
		return repositorio.findAll();
	}

}
