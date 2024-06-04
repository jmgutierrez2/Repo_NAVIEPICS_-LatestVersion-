package com.naviepics.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naviepics.model.MySQL.Vehiculo;

import com.naviepics.repo.MySQL.Vehiculo_Repo;
import com.naviepics.service.Vehiculo_Service;
import jakarta.transaction.Transactional;
@Service
public class Vehiculo_ServiceImpl implements Vehiculo_Service{
    
    @Autowired
    private Vehiculo_Repo repo;

    
    public List<Vehiculo> findAll() {
        return (List<Vehiculo>)repo.findAll();
    }

    
    public Optional<Vehiculo> findOne(Long id) {
        return repo.findById(id);
    }

    
    public Vehiculo saveOrUpdate(Vehiculo e) {
        return repo.save(e);
    }

    
    public void delete(Long id) {
        repo.deleteById(id);
    }
    
}
