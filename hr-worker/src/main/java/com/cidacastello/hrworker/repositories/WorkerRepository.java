package com.cidacastello.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cidacastello.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
