package com.engine.fakau.servicevente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.engine.fakau.servicevente.domaine.Vente;

@Repository
public interface VenteRepository extends JpaRepository<Vente, Long>{

}
