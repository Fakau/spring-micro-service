package com.engine.fakau.servicesale;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.engine.fakau.servicesale.domaine.Sale;
import com.engine.fakau.servicesale.repository.ISaleRepository;



@EnableDiscoveryClient
@SpringBootApplication
public class ServiceSaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceSaleApplication.class, args);
	}
	 @Bean 
	 CommandLineRunner initData(ISaleRepository saleRepository) { 
		 return args-> { 
			 saleRepository.saveAll( 
					 Arrays.asList( 
							 new Sale(1l, "IPhone", new BigDecimal("500")), 
							 new Sale(2l, "LG V20", new BigDecimal("310")), 
							 new Sale(3l, "Samsung G S6", new BigDecimal("250")), 
							 new Sale(4l, "TV Toshiba", new BigDecimal("170"))) ); 
			 }; 
	}
	

}
