package com.answerdigital.gpit.authserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
//@EnableDiscoveryClient
//@EnableAuthorizationServer
//@Import(AuthorisationWebApplication.class)
public class AuthorisationServer {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "authorisation-server");
		SpringApplication.run(AuthorisationServer.class, args);
	}
}
