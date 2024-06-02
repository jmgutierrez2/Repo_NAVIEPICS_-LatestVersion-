package com.naviepics.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naviepics.model.MySQL.Recibo;

import com.naviepics.repo.MySQL.Recibo_Repo;
import com.naviepics.service.Recibo_Service;
import jakarta.transaction.Transactional;
@Service
public class Recibo_ServiceImpl implements Recibo_Service{
    
    @Autowired
    private Recibo_Repo repo;

    @Transactional
    public List<Recibo> findAll() {
        return (List<Recibo>)repo.findAll();
    }

    @Transactional
    public Optional<Recibo> findOne(Long id) {
        return repo.findById(id);
    }

    @Transactional
    public Recibo saveOrUpdate(Recibo administrador) {
        return repo.save(administrador);
    }

    @Transactional
    public void delete(Long id) {
        repo.deleteById(id);
    }
    
}
