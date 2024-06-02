package com.naviepics.service;

import java.util.List;
import java.util.Optional;

import com.naviepics.model.MySQL.Reservaciones;

public interface Reservaciones_Service {
	
	List<Reservaciones> findAll();
    Optional<Reservaciones>findOne(Long id);
    Reservaciones saveOrUpdate(Reservaciones e);
    void delete(Reservaciones id);

}
