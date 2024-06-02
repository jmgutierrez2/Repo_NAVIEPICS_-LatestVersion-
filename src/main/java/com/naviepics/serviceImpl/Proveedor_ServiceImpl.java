package com.naviepics.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naviepics.model.Oracle.Proveedor;
import com.naviepics.repo.Oracle.Proveedor_Repo;
import com.naviepics.service.Proveedor_Service;

@Service
public class Proveedor_ServiceImpl implements Proveedor_Service{

	@Autowired
	private Proveedor_Repo repositorio;
	
	@Override
	public List<Proveedor> listarProveedor() {
		return repositorio.findAll();
	}

}
