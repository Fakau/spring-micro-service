package com.engine.fakau.serviceemploye;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.engine.fakau.serviceemploye.domaine.Employe;
import com.engine.fakau.serviceemploye.repository.EmployeRepository;

@SpringBootApplication
public class ServiceEmployeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceEmployeApplication.class, args);
	}
	@Bean
	CommandLineRunner initEmploye(EmployeRepository employeRepository) {
		return args->{
			employeRepository.saveAll(
					Arrays.asList(
							new Employe(1L, "Laurent", "Kafka", "Manager"),
							new Employe(2L, "Vernelus", "Jeff", "Analyst"),
							new Employe(3L, "Alexandre", "Perterson", "Programmer")
							)
			);
		};
	}

}
