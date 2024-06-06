package com.naviepics.service;

import java.util.List;
import java.util.Optional;

import com.naviepics.model.MySQL.Reporte_Incidencias;

public interface Reporte_Incidencias_Service {

	List<Reporte_Incidencias> findAll();
    Optional<Reporte_Incidencias>findOne(Long id);
    Reporte_Incidencias saveOrUpdate(Reporte_Incidencias e);
    void delete(Long id);

}
