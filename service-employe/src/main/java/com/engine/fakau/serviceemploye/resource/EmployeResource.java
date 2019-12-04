package com.engine.fakau.serviceemploye.resource;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.engine.fakau.serviceemploye.domaine.Employe;
import com.engine.fakau.serviceemploye.repository.EmployeRepository;

@RestController
public class EmployeResource {
	@Autowired
	private EmployeRepository employeRepository;
	
	@PostMapping("/employe")
	public Employe save(@Valid @RequestBody Employe employe) {
		if(employe.getId() != null) {
			throw new RuntimeException("id must not set to save a new row");
		}
		return employeRepository.save(employe);
	}
	@PutMapping("/employe")
	public Employe update(@Valid @RequestBody Employe employe) {
		if(employe.getId() == null) {
			throw new RuntimeException("cannot update entity with null id");
		}
		return employeRepository.save(employe);
	}
	@GetMapping("/employe")
	public Optional<Employe> getOne(@RequestParam("id") Long id) {
		return employeRepository.findById(id);
	}
	@GetMapping("/employes")
	public List<Employe> getAll() {
		return employeRepository.findAll();
	}
	@DeleteMapping("/employe/{id}")
	public void getAll(@PathVariable("id") Long id) {
		employeRepository.deleteById(id);
	}

}
