package com.zegat.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zegat.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
