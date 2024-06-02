package com.naviepics.service;

import java.util.List;
import java.util.Optional;

import com.naviepics.model.MySQL.Espacios;

public interface Espacios_Service {

	List<Espacios> findAll();
    Optional<Espacios>findOne(Long id);
    Espacios saveOrUpdate(Espacios e);
    void delete(Long id);

}
