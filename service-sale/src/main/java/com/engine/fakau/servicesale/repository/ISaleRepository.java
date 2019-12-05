package com.engine.fakau.servicesale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.engine.fakau.servicesale.domaine.Sale;

@Repository
public interface ISaleRepository extends JpaRepository<Sale, Long> {

}
