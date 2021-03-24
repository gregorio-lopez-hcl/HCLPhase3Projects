package com.example.Authentication;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.example.Authentication.entities.UserAuth;
import com.example.Authentication.repositories.UserRepository;
import com.example.Authentication.services.UserService;



@DataJpaTest
public class AuthenticationTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository userRepository;
    
    @Autowired 
    private UserService US; 

    UserAuth dummyUser = new UserAuth();
    
    @BeforeEach
    public void dummySetup() { 
    	
        dummyUser.setName("Dummy");
        dummyUser.setEmail("test@test.com");
        dummyUser.setPassword("password");
        entityManager.persist(dummyUser);
        entityManager.flush();
    	
    }
    
    @Test
    public void whenFindByName_thenReturnUser() {
        
        UserAuth found = userRepository.findByName(dummyUser.getName());

        assertEquals(found.getName(), dummyUser.getName());
    }
    
    @Test
    public void testCheckPassword() { 

    	String testpass = "password"; 
    	
    	String check = US.checkPassword(dummyUser, testpass); 
    	
    	assertEquals("success", check);
    }

}
