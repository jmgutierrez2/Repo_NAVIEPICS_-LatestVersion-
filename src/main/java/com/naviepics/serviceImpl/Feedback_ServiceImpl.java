package com.naviepics.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naviepics.model.MySQL.Feedback;

import com.naviepics.repo.MySQL.Feedback_Repo;
import com.naviepics.service.Feedback_Service;

@Service
public class Feedback_ServiceImpl implements Feedback_Service{

    @Autowired
    private Feedback_Repo repo;

    public List<Feedback> findAll() {
        return (List<Feedback>)repo.findAll();
    }

    public Optional<Feedback> findOne(Long id) {
        return repo.findById(id);
    }

    public Feedback saveOrUpdate(Feedback administrador) {
        return repo.save(administrador);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
    
}
