package com.naviepics.service;

import java.util.List;
import java.util.Optional;

import com.naviepics.model.MySQL.Feedback;

public interface Feedback_Service {

	List<Feedback> findAll();
    Optional<Feedback>findOne(Long id);
    Feedback saveOrUpdate(Feedback e);
    void delete(Long id);
    
}
