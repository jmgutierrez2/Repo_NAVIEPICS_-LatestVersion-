package com.naviepics.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.naviepics.model.MySQL.MySQL;
import com.naviepics.repo.MySQL.IMySQLRepo;

public class MySQLService {
	@Autowired
	private IMySQLRepo repo;
	
	public void registrar(MySQL t) {
		repo.save(t);
	}
}
