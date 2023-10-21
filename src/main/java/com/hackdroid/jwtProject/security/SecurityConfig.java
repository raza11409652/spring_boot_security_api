package com.hackdroid.jwtProject.security;

//import lombok.extern.java.Log;

import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.web.util.matcher.AntPathRequestMatcher.antMatcher;

@Configuration
public class SecurityConfig {

    @Autowired
    private JwtAuthEntryPoint point;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        System.out.println(http.);
//        Log
//        http.csrf(AbstractHttpConfigurer::disable).authorizeHttpRequests(a->a.requestMatchers(antMatcher("/auth/**")).permitAll())
//                .exceptionHandling(a->a.authenticationEntryPoint(point))
//                .sessionManagement(s->s.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
//        http.csrf()
////        http.authorizeHttpRequests()
//        http.csrf(c->c.disable()).authorizeHttpRequests(a->a.requestMatchers(antMatcher("/test"))
//                .authenticated().requestMatchers(antMatcher("/auth/**")).permitAll())
//                        .exceptionHandling(a->a.authenticationEntryPoint(point))
//                .sessionManagement(s->s.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        http.csrf(c -> c.disable()).cors(c -> c.disable())
                .authorizeHttpRequests(a -> a.anyRequest().permitAll())
                .exceptionHandling(a -> a.authenticationEntryPoint(point))
                .sessionManagement(s -> s.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        return http.build();
    }
}
