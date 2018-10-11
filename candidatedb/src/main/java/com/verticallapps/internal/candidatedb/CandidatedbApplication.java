package com.verticallapps.internal.candidatedb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CandidatedbApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CandidatedbApplication.class, args);
	}
}
