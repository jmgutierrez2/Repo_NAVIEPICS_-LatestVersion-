package com.naviepics.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.naviepics.model.MySQL.Historial_Sanciones;

import com.naviepics.repo.MySQL.Historial_Sanciones_Repo;
import com.naviepics.service.Historial_Sanciones_Service;
@Service
public class Historial_Sanciones_ServiceImpl implements Historial_Sanciones_Service{
    
    @Autowired
    private Historial_Sanciones_Repo repo;

    @Transactional
    public List<Historial_Sanciones> findAll() {
        return (List<Historial_Sanciones>)repo.findAll();
    }

    @Transactional
    public Optional<Historial_Sanciones> findOne(Long id) {
        return repo.findById(id);
    }

    @Transactional
    public Historial_Sanciones saveOrUpdate(Historial_Sanciones e) {
        return repo.save(e);
    }

    @Transactional
    public void delete(Long id) {
        repo.deleteById(id);
    }
    
}
