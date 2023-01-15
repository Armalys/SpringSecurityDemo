package com.thehecklers.aircraftpositions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {
    @Bean
    UserDetailsService autification() {
        UserDetails peter = User.builder()
                .username("peter")
                .password("ppassword")
                .roles("USER")
                .build();

        UserDetails jodie = User.builder()
                .username("jodie")
                .password("jpassword")
                .roles("USER")
                .build();

        System.out.println("    >>> Peter`s password: " + peter.getPassword());
        System.out.println("    >>> Jodie`s password: " + jodie.getPassword());

        return new InMemoryUserDetailsManager(peter, jodie);
    }
}
