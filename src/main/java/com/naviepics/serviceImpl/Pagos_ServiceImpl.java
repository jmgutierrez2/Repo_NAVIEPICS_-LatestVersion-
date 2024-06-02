package com.naviepics.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naviepics.model.MySQL.Pagos;

import com.naviepics.repo.MySQL.Pagos_Repo;
import com.naviepics.service.Pagos_Service;
import jakarta.transaction.Transactional;
@Service
public class Pagos_ServiceImpl implements Pagos_Service{
    
    @Autowired
    private Pagos_Repo repo;

    @Transactional
    public List<Pagos> findAll() {
        return (List<Pagos>)repo.findAll();
    }

    @Transactional
    public Optional<Pagos> findOne(Long id) {
        return repo.findById(id);
    }

    @Transactional
    public Pagos saveOrUpdate(Pagos e) {
        return repo.save(e);
    }

    @Transactional
    public void delete(Long id) {
        repo.deleteById(id);
    }
    
}
