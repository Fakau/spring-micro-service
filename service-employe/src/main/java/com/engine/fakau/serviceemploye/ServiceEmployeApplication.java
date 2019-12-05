package com.engine.fakau.serviceemploye;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.engine.fakau.serviceemploye.domaine.Employe;
import com.engine.fakau.serviceemploye.repository.IEmployeRepository;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceEmployeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceEmployeApplication.class, args);
	}
	@Bean
	CommandLineRunner init(IEmployeRepository employeRepository) {
		return args -> {
			employeRepository.saveAll(
					Arrays.asList(new Employe(1L, "Kafka", "Laurent", "Technologique"),
							      new Employe(2L, "Jeff", "Vernelus", "Psychologique"))
			);
		};
	}

}
