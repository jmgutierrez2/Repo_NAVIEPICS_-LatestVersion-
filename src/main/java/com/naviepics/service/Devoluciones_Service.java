package com.naviepics.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.naviepics.model.MySQL.Devoluciones;
import com.naviepics.repo.MySQL.Devoluciones_Repo;

public interface Devoluciones_Service {
	
	List<Devoluciones> findAll();
    Optional<Devoluciones>findOne(Long id);
    Devoluciones saveOrUpdate(Devoluciones administrador);
    void delete(Long id);
}
