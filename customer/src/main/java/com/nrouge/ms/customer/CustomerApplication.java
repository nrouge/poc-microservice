package com.nrouge.ms.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

	final List<Customer> customers = Arrays.asList(
			new Customer(1L, "Brad", "PITT", LocalDate.of(1963, 12, 18)),
			new Customer(2L, "Angelina", "JOLIE", LocalDate.of(1975, 6, 4))
	);

	@GetMapping("/customers")
	public List<Customer> allCustomers() {
		return customers;
	}
}