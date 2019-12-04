package com.engine.fakau.servicevente;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.engine.fakau.servicevente.domaine.Vente;
import com.engine.fakau.servicevente.repository.VenteRepository;

@SpringBootApplication
public class ServiceVenteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceVenteApplication.class, args);
	}
	@Bean
	 CommandLineRunner initData(VenteRepository venteRepository) {
		return args -> {
			venteRepository.saveAll(
					Arrays.asList(
							new Vente(1l, "IPhone", new BigDecimal("500")), 
							new Vente(2l, "LG V20", new BigDecimal("310")), 
							new Vente(3l, "Samsung G S6", new BigDecimal("250")), 
							new Vente(4l, "TV Toshiba", new BigDecimal("170")))
	         );
		};
	}

}
