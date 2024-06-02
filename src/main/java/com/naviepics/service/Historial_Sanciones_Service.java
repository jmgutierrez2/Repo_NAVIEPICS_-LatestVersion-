package com.naviepics.service;

import java.util.List;
import java.util.Optional;

import com.naviepics.model.MySQL.Historial_Sanciones;

public interface Historial_Sanciones_Service {

	List<Historial_Sanciones> findAll();
    Optional<Historial_Sanciones>findOne(Long id);
    Historial_Sanciones saveOrUpdate(Historial_Sanciones e);
    void delete(Historial_Sanciones id);

}
