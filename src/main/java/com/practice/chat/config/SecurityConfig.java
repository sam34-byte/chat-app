package com.practice.chat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
@Configuration

public class SecurityConfig {

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails userOne = User.withUsername("santa").password("{noop}santa@123").authorities("user").build();
        UserDetails userTwo = User.withUsername("banta").password("{noop}banta@123").authorities("user").build();

        return new InMemoryUserDetailsManager(userOne, userTwo);
    }

}
