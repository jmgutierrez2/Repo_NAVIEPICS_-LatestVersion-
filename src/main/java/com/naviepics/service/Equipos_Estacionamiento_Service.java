package com.naviepics.service;

import java.util.List;
import java.util.Optional;

import com.naviepics.model.Oracle.Equipos_Estacionamiento;


public interface Equipos_Estacionamiento_Service {
	List<Equipos_Estacionamiento> findAll();
    Optional<Equipos_Estacionamiento>findOne(Long id);
    Equipos_Estacionamiento saveOrUpdate(Equipos_Estacionamiento e);
    void delete(Long id);
}
