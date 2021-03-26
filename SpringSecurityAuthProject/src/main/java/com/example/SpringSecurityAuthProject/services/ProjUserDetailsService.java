package com.example.SpringSecurityAuthProject.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;

import org.springframework.stereotype.Service;

import com.example.SpringSecurityAuthProject.entities.AuthUsers;
import com.example.SpringSecurityAuthProject.entities.ProjUserDetails;
import com.example.SpringSecurityAuthProject.repository.UserRepo;

@Service
public class ProjUserDetailsService implements UserDetailsService { 
	
	
	@Autowired
	UserRepo us; 
	
	@Override 
	public ProjUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<AuthUsers> user = us.findByUsername(username);
	
		user.orElseThrow(() -> new  UsernameNotFoundException("Not found: " + username));
		
		return user.map(ProjUserDetails::new).get(); 
	}
	
}
