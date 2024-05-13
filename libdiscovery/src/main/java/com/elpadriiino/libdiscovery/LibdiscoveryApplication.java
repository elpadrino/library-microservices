package com.elpadriiino.libdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LibdiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibdiscoveryApplication.class, args);
	}

}
