package com.naviepics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.naviepics.model.MySQL.MySQL;
import com.naviepics.model.Oracle.Oracle;
import com.naviepics.service.MySQLService;
import com.naviepics.service.OracleService;
import org.springframework.http.HttpStatus;


@RestController
@RequestMapping("/databases")
public class TestController {
	@Autowired
	private MySQLService mysqlService;
	
	@Autowired
	private OracleService oracleService;
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/mysql")
	public void registrarUsuarioMysql(@RequestBody MySQL mysql) {
		mysqlService.registrar(mysql);
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/oracle")
	public void registrarUsuarioMysql(@RequestBody Oracle oracle) {
		oracleService.registrar(oracle);
	}
}
