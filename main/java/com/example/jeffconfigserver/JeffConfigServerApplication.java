package com.example.jeffconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class JeffConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JeffConfigServerApplication.class, args);
	}

}
