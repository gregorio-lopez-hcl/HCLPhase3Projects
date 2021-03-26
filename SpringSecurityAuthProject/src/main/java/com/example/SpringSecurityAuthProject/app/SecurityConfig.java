package com.example.SpringSecurityAuthProject.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@SuppressWarnings("deprecation")
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	UserDetailsService userDetailsService; 
	
//	@Override 
//	protected void configure(AuthenticationManagerBuilder a) throws Exception { 
//		a.userDetailsService(userDetailsService);
//	}
	
	@Override 
	protected void configure(AuthenticationManagerBuilder a) throws Exception {
		a.inMemoryAuthentication()
		.withUser("bob")
		.password("password")
		.roles("USER"); 
	}
	
	@Override 
	protected void configure(HttpSecurity h) throws Exception { 
		h.authorizeRequests()
	          .antMatchers("/login").hasAnyRole("USER")
	          .antMatchers("/").permitAll()
	          .and().formLogin()
	          .defaultSuccessUrl("/user", true)
	          .permitAll()
	          .and().logout()
	          .logoutSuccessUrl("/");
	        }
	
	@Bean
	public PasswordEncoder getPasswordEncoder () { 
		return NoOpPasswordEncoder.getInstance(); 
	}

}
