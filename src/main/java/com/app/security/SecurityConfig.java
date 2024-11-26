package com.app.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Désactiver CSRF pour les API REST
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/public/**", "/login", "/register").permitAll() // Routes publiques
                        .anyRequest().authenticated() // Toutes les autres routes nécessitent une authentification
                )
                .formLogin(form -> form
                        .loginPage("/login") // Page de connexion personnalisée (si nécessaire)
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutUrl("/logout")
                        .permitAll()
                );

        return http.build();
    }
}
