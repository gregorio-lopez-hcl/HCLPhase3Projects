package com.example.SpringSecurityAuthProject.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.SpringSecurityAuthProject.entities.AuthUsers;
import com.example.SpringSecurityAuthProject.repository.UserRepo;

@SpringBootApplication
@EnableJpaRepositories (basePackageClasses = UserRepo.class)
@EntityScan(basePackageClasses=AuthUsers.class)
public class SpringSecurityAuthProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityAuthProjectApplication.class, args);
	}

}
