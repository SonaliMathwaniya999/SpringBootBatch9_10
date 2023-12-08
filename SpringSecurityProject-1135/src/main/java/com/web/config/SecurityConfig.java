package com.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.web.service.UserInfoUserDetailsService;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

	@Bean
	public UserDetailsService userDetailsService() 
	{
	/*	
	UserDetails admin  = User.withUsername("basant")
	                       .password(encoder.encode("pwd1"))
	                       .roles("ADMIN")
	                       .build();
		UserDetails user = User.withUsername("john")
			.password(encoder.encode("pwd2"))
			.roles("USER")
			.build();
	
	//	return admin;
		
		//  return new InMemoryUserDetailsManager(admin, user);
  */
  return new UserInfoUserDetailsService();
		
	}
	

	    
	   
	 @Bean
	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	        return http.csrf().disable()
	                .authorizeHttpRequests()
	                .requestMatchers("/products/welcome","/products/new").permitAll()
	                .and()
	                .authorizeHttpRequests().requestMatchers("/products/**")
	                .authenticated().and().formLogin().and().build();
	    }

	    

	
	 
    
		@Bean
		public BCryptPasswordEncoder passwordEncoder()
		{
		 return new BCryptPasswordEncoder();
		}
		
		
	
	

	 @Bean
	    public AuthenticationProvider authenticationProvider(){
	        DaoAuthenticationProvider authenticationProvider=new DaoAuthenticationProvider();
	        authenticationProvider.setUserDetailsService(userDetailsService());
	        authenticationProvider.setPasswordEncoder(passwordEncoder());
	        return authenticationProvider;
	    }
	   
	
}
