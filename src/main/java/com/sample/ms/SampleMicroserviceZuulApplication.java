package com.sample.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SampleMicroserviceZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleMicroserviceZuulApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String sayHello()
	{
		return "Hello Sumanth";
	}

}
