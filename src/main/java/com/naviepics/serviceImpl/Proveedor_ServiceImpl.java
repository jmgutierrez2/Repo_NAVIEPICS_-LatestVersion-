package com.naviepics.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naviepics.model.Oracle.Proveedor;

import com.naviepics.repo.Oracle.Proveedor_Repo;
import com.naviepics.service.Proveedor_Service;
import jakarta.transaction.Transactional;
@Service
public class Proveedor_ServiceImpl implements Proveedor_Service{
    
    @Autowired
    private Proveedor_Repo repo;

    @Transactional
    public List<Proveedor> findAll() {
        return (List<Proveedor>)repo.findAll();
    }

    @Transactional
    public Optional<Proveedor> findOne(Long id) {
        return repo.findById(id);
    }

    @Transactional
    public Proveedor saveOrUpdate(Proveedor administrador) {
        return repo.save(administrador);
    }

    @Transactional
    public void delete(Long id) {
        repo.deleteById(id);
    }
    
}
