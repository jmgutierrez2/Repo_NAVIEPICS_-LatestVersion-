package com.naviepics.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naviepics.model.MySQL.Estacionamiento;

import com.naviepics.repo.MySQL.Estacionamiento_Repo;
import com.naviepics.service.Estacionamiento_Service;
import jakarta.transaction.Transactional;
@Service
public class Estacionamiento_ServiceImpl implements Estacionamiento_Service{
    
    @Autowired
    private Estacionamiento_Repo repo;

    public List<Estacionamiento> findAll() {
        return (List<Estacionamiento>)repo.findAll();
    }

    public Optional<Estacionamiento> findOne(Long id) {
        return repo.findById(id);
    }
    public Estacionamiento saveOrUpdate(Estacionamiento e) {
        return repo.save(e);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
    
}
