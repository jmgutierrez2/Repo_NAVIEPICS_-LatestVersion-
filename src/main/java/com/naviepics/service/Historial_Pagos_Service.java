package com.naviepics.service;

import java.util.List;
import java.util.Optional;

import com.naviepics.model.MySQL.Historial_Pagos;

public interface Historial_Pagos_Service {

	List<Historial_Pagos> findAll();
    Optional<Historial_Pagos>findOne(Long id);
    Historial_Pagos saveOrUpdate(Historial_Pagos e);
    void delete(Long id);

}
