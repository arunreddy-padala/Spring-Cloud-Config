package com.arunreddypadala.insuranceconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class InsuranceConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceConfigServerApplication.class, args);
	}

}

//Check whether connection to git working: http://localhost:8888/actuator/default