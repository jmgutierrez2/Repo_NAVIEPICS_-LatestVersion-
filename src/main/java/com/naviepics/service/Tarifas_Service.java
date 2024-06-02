package com.naviepics.service;

import java.util.List;
import java.util.Optional;

import com.naviepics.model.MySQL.Tarifas;

public interface Tarifas_Service {

	List<Tarifas> findAll();
    Optional<Tarifas>findOne(Long id);
    Tarifas saveOrUpdate(Tarifas e);
    void delete(Long id);

}
