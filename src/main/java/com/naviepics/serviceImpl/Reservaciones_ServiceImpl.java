package com.naviepics.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naviepics.model.MySQL.Reservaciones;

import com.naviepics.repo.MySQL.Reservaciones_Repo;
import com.naviepics.service.Reservaciones_Service;
@Service
public class Reservaciones_ServiceImpl implements Reservaciones_Service{
    
    @Autowired
    private Reservaciones_Repo repo;

    public List<Reservaciones> findAll() {
        return (List<Reservaciones>)repo.findAll();
    }

    public Optional<Reservaciones> findOne(Long id) {
        return repo.findById(id);
    }

    public Reservaciones saveOrUpdate(Reservaciones administrador) {
        return repo.save(administrador);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
    
}
