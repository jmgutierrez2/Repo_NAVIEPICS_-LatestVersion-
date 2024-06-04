package com.naviepics.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naviepics.model.MySQL.Tipo_Espacios;

import com.naviepics.repo.MySQL.Tipo_Espacios_Repo;
import com.naviepics.service.Tipo_Espacios_Service;
import jakarta.transaction.Transactional;
@Service
public class Tipo_Espacios_ServiceImpl implements Tipo_Espacios_Service{
    
    @Autowired
    private Tipo_Espacios_Repo repo;

    public List<Tipo_Espacios> findAll() {
        return (List<Tipo_Espacios>)repo.findAll();
    }

    public Optional<Tipo_Espacios> findOne(Long id) {
        return repo.findById(id);
    }

    
    public Tipo_Espacios saveOrUpdate(Tipo_Espacios administrador) {
        return repo.save(administrador);
    }

    
    public void delete(Long id) {
        repo.deleteById(id);
    }
    
}
