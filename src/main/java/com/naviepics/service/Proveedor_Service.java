package com.naviepics.service;

import java.util.List;
import java.util.Optional;

import com.naviepics.model.Oracle.Proveedor;

public interface Proveedor_Service {
	
	List<Proveedor> findAll();
    Optional<Proveedor>findOne(Long id);
    Proveedor saveOrUpdate(Proveedor e);
    void delete(Long id);

}
