package com.engine.fakau.serviceemploye.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.engine.fakau.serviceemploye.repository.EmployeRepository;

@Service
public class EmployeService {
  
	@Autowired
	private EmployeRepository employeRepository;
}
