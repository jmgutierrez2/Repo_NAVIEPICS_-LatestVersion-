package com.naviepics.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.naviepics.model.Oracle.Oracle;
import com.naviepics.repo.Oracle.IOracleRepo;


public class OracleService {
	@Autowired
	private IOracleRepo repo;
	
	public void registrar(Oracle t) {
		repo.save(t);
	}
}
