package com.elpadriiino.libconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class LibconfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibconfigServerApplication.class, args);
	}

}
