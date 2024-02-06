package com.example.bus.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class CorsConfig extends WebMvcConfigurationSupport {

    public void addCorsMapping(CorsRegistry registry){
        registry.addMapping("/**").allowedOrigins("http://localhost:4200").allowedMethods("/*")
                .allowCredentials(false);
    }

}