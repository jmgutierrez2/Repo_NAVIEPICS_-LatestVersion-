package com.naviepics.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naviepics.model.Oracle.Mantenimiento_Equipos;

import com.naviepics.repo.Oracle.Mantenimiento_Equipos_Repo;
import com.naviepics.service.Mantenimiento_Equipos_Service;
import jakarta.transaction.Transactional;
@Service
public class Mantenimiento_Equipos_ServiceImpl implements Mantenimiento_Equipos_Service{
    
    @Autowired
    private Mantenimiento_Equipos_Repo repo;

    @Transactional
    public List<Mantenimiento_Equipos> findAll() {
        return (List<Mantenimiento_Equipos>)repo.findAll();
    }

    @Transactional
    public Optional<Mantenimiento_Equipos> findOne(Long id) {
        return repo.findById(id);
    }

    @Transactional
    public Mantenimiento_Equipos saveOrUpdate(Mantenimiento_Equipos administrador) {
        return repo.save(administrador);
    }

    @Transactional
    public void delete(Long id) {
        repo.deleteById(id);
    }
    
}
