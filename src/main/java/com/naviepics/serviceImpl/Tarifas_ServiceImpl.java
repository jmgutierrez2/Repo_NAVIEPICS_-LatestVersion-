package com.naviepics.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naviepics.model.MySQL.Tarifas;

import com.naviepics.repo.MySQL.Tarifas_Repo;
import com.naviepics.service.Tarifas_Service;
@Service
public class Tarifas_ServiceImpl implements Tarifas_Service{
    
    @Autowired
    private Tarifas_Repo repo;

    public List<Tarifas> findAll() {
        return (List<Tarifas>)repo.findAll();
    }

    public Optional<Tarifas> findOne(Long id) {
        return repo.findById(id);
    }

    public Tarifas saveOrUpdate(Tarifas administrador) {
        return repo.save(administrador);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
    
}
