package com.engine.fakau.servicesale.web;

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

import com.engine.fakau.servicesale.domaine.Sale;
import com.engine.fakau.servicesale.repository.ISaleRepository;

@RestController
public class SaleResource {
	@Autowired
	private ISaleRepository saleRepository;
	
	@PostMapping("/sale")
	public Sale save(@Valid @RequestBody Sale sale) {
		if(sale.getId() != null) {
			throw new RuntimeException("id must not set to save a new row");
		}
		return saleRepository.save(sale);
	}
	@PutMapping("/sale")
	public Sale update(@Valid @RequestBody Sale sale) {
		if(sale.getId() == null) {
			throw new RuntimeException("cannot update entity with null id");
		}
		return saleRepository.save(sale);
	}
	@GetMapping("/sale")
	public Optional<Sale> getOne(@RequestParam("id") Long id) {
		return saleRepository.findById(id);
	}
	@GetMapping("/sales")
	public List<Sale> getAll() {
		return saleRepository.findAll();
	}
	@DeleteMapping("/sale/{id}")
	public void getAll(@PathVariable("id") Long id) {
		saleRepository.deleteById(id);
	}
}
