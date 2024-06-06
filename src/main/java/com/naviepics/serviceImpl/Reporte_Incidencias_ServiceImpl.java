package com.naviepics.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naviepics.model.MySQL.Reporte_Incidencias;

import com.naviepics.repo.MySQL.Reporte_Incidencias_Repo;
import com.naviepics.service.Reporte_Incidencias_Service;

@Service
public class Reporte_Incidencias_ServiceImpl implements Reporte_Incidencias_Service{

    @Autowired
    private Reporte_Incidencias_Repo repo;

    public List<Reporte_Incidencias> findAll() {
        return (List<Reporte_Incidencias>)repo.findAll();
    }

    public Optional<Reporte_Incidencias> findOne(Long id) {
        return repo.findById(id);
    }

    public Reporte_Incidencias saveOrUpdate(Reporte_Incidencias administrador) {
        return repo.save(administrador);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
    
}
