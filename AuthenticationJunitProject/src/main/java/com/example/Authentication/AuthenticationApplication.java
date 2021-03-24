package com.example.Authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


import com.example.Authentication.controllers.ViewController;
import com.example.Authentication.entities.UserAuth;
import com.example.Authentication.exceptions.UserNotFoundException;
import com.example.Authentication.services.UserService;



@Import({
    ViewController.class,
    UserNotFoundException.class,
    UserService.class,
    UserAuth.class
})

@SpringBootApplication
public class AuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationApplication.class, args);
	}

}

