package com.naviepics.service;

import java.util.List;
import java.util.Optional;

import com.naviepics.model.MySQL.Vehiculo;

public interface Vehiculo_Service {

	List<Vehiculo> findAll();
    Optional<Vehiculo>findOne(Long id);
    Vehiculo saveOrUpdate(Vehiculo e);
    void delete(Long id);
}
