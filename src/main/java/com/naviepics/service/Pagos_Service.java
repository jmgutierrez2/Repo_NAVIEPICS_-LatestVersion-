package com.naviepics.service;

import java.util.List;
import java.util.Optional;

import com.naviepics.model.MySQL.Pagos;

public interface Pagos_Service {

	List<Pagos> findAll();
    Optional<Pagos>findOne(Long id);
    Pagos saveOrUpdate(Pagos e);
    void delete(Pagos id);

}
