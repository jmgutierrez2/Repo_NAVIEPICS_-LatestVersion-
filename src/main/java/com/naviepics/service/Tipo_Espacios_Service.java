package com.naviepics.service;

import java.util.List;
import java.util.Optional;

import com.naviepics.model.MySQL.Tipo_Espacios;

public interface Tipo_Espacios_Service {

	List<Tipo_Espacios> findAll();
    Optional<Tipo_Espacios>findOne(Long id);
    Tipo_Espacios saveOrUpdate(Tipo_Espacios e);
    void delete(Long id);

}
