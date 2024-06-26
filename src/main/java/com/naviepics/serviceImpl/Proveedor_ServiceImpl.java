package com.naviepics.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naviepics.model.Oracle.Proveedor;

import com.naviepics.repo.Oracle.Proveedor_Repo;
import com.naviepics.service.Proveedor_Service;
@Service
public class Proveedor_ServiceImpl implements Proveedor_Service{
    
    @Autowired
    private Proveedor_Repo repo;

    public List<Proveedor> findAll() {
        return (List<Proveedor>)repo.findAll();
    }

    public Optional<Proveedor> findOne(Long id) {
        return repo.findById(id);
    }

    public Proveedor saveOrUpdate(Proveedor e) {
        return repo.save(e);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
    
}
