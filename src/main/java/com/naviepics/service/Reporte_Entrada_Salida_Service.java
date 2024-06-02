package com.naviepics.service;

import java.util.List;
import java.util.Optional;

import com.naviepics.model.MySQL.Reporte_Entrada_Salida;

public interface Reporte_Entrada_Salida_Service {
	
	List<Reporte_Entrada_Salida> findAll();
    Optional<Reporte_Entrada_Salida>findOne(Long id);
    Reporte_Entrada_Salida saveOrUpdate(Reporte_Entrada_Salida e);
    void delete(Reporte_Entrada_Salida id);

}
