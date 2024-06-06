package com.naviepics.repo.MySQL;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naviepics.model.MySQL.Feedback;


public interface Feedback_Repo extends JpaRepository<Feedback,Long> {

}
