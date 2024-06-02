package com.naviepics.service;

import java.util.List;
import java.util.Optional;

import com.naviepics.model.Oracle.Mantenimiento_Equipos;

public interface Mantenimiento_Equipos_Service {

	List<Mantenimiento_Equipos> findAll();
    Optional<Mantenimiento_Equipos>findOne(Long id);
    Mantenimiento_Equipos saveOrUpdate(Mantenimiento_Equipos e);
    void delete(Long id);


}
