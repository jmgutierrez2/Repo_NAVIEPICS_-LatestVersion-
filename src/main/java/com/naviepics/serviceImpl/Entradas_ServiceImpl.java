package com.naviepics.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naviepics.model.MySQL.Entradas;

import com.naviepics.repo.MySQL.Entradas_Repo;
import com.naviepics.service.Entradas_Service;
import jakarta.transaction.Transactional;
@Service
public class Entradas_ServiceImpl implements Entradas_Service{
    
    @Autowired
    private Entradas_Repo repo;

    public List<Entradas> findAll() {
        return (List<Entradas>)repo.findAll();
    }

    public Optional<Entradas> findOne(Long id) {
        return repo.findById(id);
    }

    public Entradas saveOrUpdate(Entradas e) {
        return repo.save(e);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
    
}
