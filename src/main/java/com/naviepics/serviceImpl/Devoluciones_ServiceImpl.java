package com.naviepics.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.naviepics.model.MySQL.Devoluciones;
import com.naviepics.repo.MySQL.Devoluciones_Repo;
import com.naviepics.service.Devoluciones_Service;
@Service
public class Devoluciones_ServiceImpl implements Devoluciones_Service{
	
	@Autowired
	private Devoluciones_Repo repo;

	public List<Devoluciones> findAll() {
        return (List<Devoluciones>)repo.findAll();
	}

	public Optional<Devoluciones> findOne(Long id) {
		return repo.findById(id);
	}

	public Devoluciones saveOrUpdate(Devoluciones e) {
		return repo.save(e);
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}
	
}
