package tn.iit.studentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import tn.iit.studentservice.decoder.CustomErrorDecoder;
@EnableDiscoveryClient
@EnableFeignClients("tn/iit/studentservice/proxies")
@SpringBootApplication
public class StudentServiceApplication {
	@Bean
	public CustomErrorDecoder mCustomErrorDecoder(){
		return new CustomErrorDecoder();
	}


	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}

}
