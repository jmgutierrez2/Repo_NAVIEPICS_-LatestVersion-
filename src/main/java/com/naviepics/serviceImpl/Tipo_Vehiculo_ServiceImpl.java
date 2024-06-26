package com.naviepics.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naviepics.model.MySQL.Tipo_Vehiculo;

import com.naviepics.repo.MySQL.Tipo_Vehiculo_Repo;
import com.naviepics.service.Tipo_Vehiculo_Service;
@Service
public class Tipo_Vehiculo_ServiceImpl implements Tipo_Vehiculo_Service{
    
    @Autowired
    private Tipo_Vehiculo_Repo repo;

    
    public List<Tipo_Vehiculo> findAll() {
        return (List<Tipo_Vehiculo>)repo.findAll();
    }

    
    public Optional<Tipo_Vehiculo> findOne(Long id) {
        return repo.findById(id);
    }

    
    public Tipo_Vehiculo saveOrUpdate(Tipo_Vehiculo administrador) {
        return repo.save(administrador);
    }

    
    public void delete(Long id) {
        repo.deleteById(id);
    }
    
}
