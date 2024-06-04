package com.naviepics.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naviepics.model.MySQL.Reporte_Entrada_Salida;

import com.naviepics.repo.MySQL.Reporte_Entrada_Salida_Repo;
import com.naviepics.service.Reporte_Entrada_Salida_Service;
import jakarta.transaction.Transactional;
@Service
public class Reporte_Entrada_Salida_ServiceImpl implements Reporte_Entrada_Salida_Service{
    
    @Autowired
    private Reporte_Entrada_Salida_Repo repo;

    public List<Reporte_Entrada_Salida> findAll() {
        return (List<Reporte_Entrada_Salida>)repo.findAll();
    }

    public Optional<Reporte_Entrada_Salida> findOne(Long id) {
        return repo.findById(id);
    }

    public Reporte_Entrada_Salida saveOrUpdate(Reporte_Entrada_Salida administrador) {
        return repo.save(administrador);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
    
}
