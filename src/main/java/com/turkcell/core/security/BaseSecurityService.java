package com.turkcell.core.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Service;

@Service
public class BaseSecurityService {

    private final BaseJwtFilter jwtFilter;

    public BaseSecurityService(BaseJwtFilter jwtFilter) {
        this.jwtFilter = jwtFilter;
    }

    public void configureCommonSecurityRules(HttpSecurity http)throws Exception{
        http

                .csrf(AbstractHttpConfigurer::disable) //cross-site request forgery web güvenlik açığı
                .httpBasic(AbstractHttpConfigurer::disable)
                .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);//bu filtreden önce çalış jwtfilter diyoruz

    }
}
