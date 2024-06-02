package com.naviepics.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naviepics.model.MySQL.Reservaciones;

import com.naviepics.repo.MySQL.Reservaciones_Repo;
import com.naviepics.service.Reservaciones_Service;
import jakarta.transaction.Transactional;
@Service
public class Reservaciones_ServiceImpl implements Reservaciones_Service{
    
    @Autowired
    private Reservaciones_Repo repo;

    @Transactional
    public List<Reservaciones> findAll() {
        return (List<Reservaciones>)repo.findAll();
    }

    @Transactional
    public Optional<Reservaciones> findOne(Long id) {
        return repo.findById(id);
    }

    @Transactional
    public Reservaciones saveOrUpdate(Reservaciones administrador) {
        return repo.save(administrador);
    }

    @Transactional
    public void delete(Long id) {
        repo.deleteById(id);
    }
    
}
