package com.naviepics.service;

import java.util.List;
import java.util.Optional;

import com.naviepics.model.MySQL.Devoluciones;

public interface Devoluciones_Service {
	
	List<Devoluciones> findAll();
    Optional<Devoluciones>findOne(Long id);
    Devoluciones saveOrUpdate(Devoluciones d);
    void delete(Long id);
}
