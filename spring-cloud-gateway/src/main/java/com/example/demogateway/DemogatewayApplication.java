package com.example.demogateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class DemogatewayApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemogatewayApplication.class, args);
	}
}
