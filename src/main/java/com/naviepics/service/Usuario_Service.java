package com.naviepics.service;

import java.util.List;
import java.util.Optional;

import com.naviepics.model.MySQL.Usuario;

public interface Usuario_Service {

	List<Usuario> findAll();
    Optional<Usuario>findOne(Long id);
    Usuario saveOrUpdate(Usuario e);
    void delete(Usuario id);
}
