package com.engine.fakau.serviceemploye.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.engine.fakau.serviceemploye.domaine.Employe;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long>{

}
