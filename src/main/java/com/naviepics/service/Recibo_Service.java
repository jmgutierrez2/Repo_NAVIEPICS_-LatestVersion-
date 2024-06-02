package com.naviepics.service;

import java.util.List;
import java.util.Optional;

import com.naviepics.model.MySQL.Recibo;

public interface Recibo_Service {

	List<Recibo> findAll();
    Optional<Recibo>findOne(Long id);
    Recibo saveOrUpdate(Recibo e);
    void delete(Recibo id);
	
}
