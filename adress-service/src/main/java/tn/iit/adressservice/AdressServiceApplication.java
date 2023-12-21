package tn.iit.adressservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AdressServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdressServiceApplication.class, args);
	}
}
