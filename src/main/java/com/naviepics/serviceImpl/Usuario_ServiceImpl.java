package com.naviepics.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naviepics.model.MySQL.Usuario;

import com.naviepics.repo.MySQL.Usuario_Repo;
import com.naviepics.service.Usuario_Service;
import jakarta.transaction.Transactional;
@Service
public class Usuario_ServiceImpl implements Usuario_Service{
    
    @Autowired
    private Usuario_Repo repo;

    @Transactional
    public List<Usuario> findAll() {
        return (List<Usuario>)repo.findAll();
    }

    @Transactional
    public Optional<Usuario> findOne(Long id) {
        return repo.findById(id);
    }

    @Transactional
    public Usuario saveOrUpdate(Usuario e) {
        return repo.save(e);
    }

    @Transactional
    public void delete(Long id) {
        repo.deleteById(id);
    }
    
}
