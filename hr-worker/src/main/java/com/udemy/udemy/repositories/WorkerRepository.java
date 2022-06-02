package com.udemy.udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.udemy.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}