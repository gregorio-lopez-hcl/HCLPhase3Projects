package com.example.SpringSecurityAuthProject.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.SpringSecurityAuthProject.entities.ProjUserDetails;

@Service
public class ProjUserDetailsService implements UserDetailsService { 
	
	@Override 
	public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
		return new ProjUserDetails(s);
	}


}
