package com.naviepics.service;

import java.util.List;
import java.util.Optional;

import com.naviepics.model.MySQL.Tipo_Vehiculo;

public interface Tipo_Vehiculo_Service {

	List<Tipo_Vehiculo> findAll();
    Optional<Tipo_Vehiculo>findOne(Long id);
    Tipo_Vehiculo saveOrUpdate(Tipo_Vehiculo e);
    void delete(Tipo_Vehiculo id);
}
