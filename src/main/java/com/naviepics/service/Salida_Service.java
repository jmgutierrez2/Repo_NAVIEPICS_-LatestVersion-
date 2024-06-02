package com.naviepics.service;

import java.util.List;
import java.util.Optional;

import com.naviepics.model.MySQL.Salida;

public interface Salida_Service {

	List<Salida> findAll();
    Optional<Salida>findOne(Long id);
    Salida saveOrUpdate(Salida e);
    void delete(Salida id);

}
