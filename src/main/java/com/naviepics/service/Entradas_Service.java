package com.naviepics.service;

import java.util.List;
import java.util.Optional;

import com.naviepics.model.MySQL.Entradas;


public interface Entradas_Service{
	List<Entradas> findAll();
    Optional<Entradas>findOne(Long id);
    Entradas saveOrUpdate(Entradas e);
    void delete(Long id);
}
