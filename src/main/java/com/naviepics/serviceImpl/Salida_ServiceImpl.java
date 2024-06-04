package com.naviepics.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naviepics.model.MySQL.Salida;

import com.naviepics.repo.MySQL.Salida_Repo;
import com.naviepics.service.Salida_Service;
import jakarta.transaction.Transactional;
@Service
public class Salida_ServiceImpl implements Salida_Service{
    
    @Autowired
    private Salida_Repo repo;

    public List<Salida> findAll() {
        return (List<Salida>)repo.findAll();
    }

    public Optional<Salida> findOne(Long id) {
        return repo.findById(id);
    }

    public Salida saveOrUpdate(Salida administrador) {
        return repo.save(administrador);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
    
}
