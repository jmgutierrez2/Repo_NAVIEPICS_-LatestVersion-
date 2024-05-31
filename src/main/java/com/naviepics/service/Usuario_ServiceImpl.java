package com.naviepics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naviepics.model.MySQL.Usuario;
import com.naviepics.repo.MySQL.Usuario_Repo;

@Service
public class Usuario_ServiceImpl implements Usuario_Service{

	@Autowired
	private Usuario_Repo repositorio;

	@Override
	public List<Usuario> listarUsuario() {
		return repositorio.findAll();
	}

}
