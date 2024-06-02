package com.naviepics.service;

import java.util.List;
import java.util.Optional;

import com.naviepics.model.MySQL.Estacionamiento;

public interface Estacionamiento_Service {

	List<Estacionamiento> findAll();
    Optional<Estacionamiento>findOne(Long id);
    Estacionamiento saveOrUpdate(Estacionamiento e);
    void delete(Long id);

}
