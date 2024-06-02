package com.naviepics.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naviepics.model.MySQL.Historial_Pagos;

import com.naviepics.repo.MySQL.Historial_Pagos_Repo;
import com.naviepics.service.Historial_Pagos_Service;
import jakarta.transaction.Transactional;
@Service
public class Historial_Pagos_ServiceImpl implements Historial_Pagos_Service{
    
    @Autowired
    private Historial_Pagos_Repo repo;

    @Transactional
    public List<Historial_Pagos> findAll() {
        return (List<Historial_Pagos>)repo.findAll();
    }

    @Transactional
    public Optional<Historial_Pagos> findOne(Long id) {
        return repo.findById(id);
    }

    @Transactional
    public Historial_Pagos saveOrUpdate(Historial_Pagos e) {
        return repo.save(e);
    }

    @Transactional
    public void delete(Long id) {
        repo.deleteById(id);
    }
	
    
}
