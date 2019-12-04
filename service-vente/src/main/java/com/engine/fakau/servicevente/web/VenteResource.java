package com.engine.fakau.servicevente.web;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.engine.fakau.servicevente.domaine.Vente;
import com.engine.fakau.servicevente.repository.VenteRepository;

@RestController
public class VenteResource {
	@Autowired
	private VenteRepository renteRepository;
	
	@PostMapping("/vente")
	public Vente save(@Valid @RequestBody Vente vente) {
		if(vente.getId() != null) {
			throw new RuntimeException("id must not set to save a new row");
		}
		return renteRepository.save(vente);
	}
	@PutMapping("/vente")
	public Vente update(@Valid @RequestBody Vente vente) {
		if(vente.getId() == null) {
			throw new RuntimeException("cannot update entity with null id");
		}
		return renteRepository.save(vente);
	}
	@GetMapping("/vente")
	public Optional<Vente> getOne(@RequestParam("id") Long id) {
		return renteRepository.findById(id);
	}
	@GetMapping("/ventes")
	public List<Vente> getAll() {
		return renteRepository.findAll();
	}
	@DeleteMapping("/vente/id")
	public void getAll(@PathParam("id") Long id) {
		 renteRepository.deleteById(id);
	}

}
