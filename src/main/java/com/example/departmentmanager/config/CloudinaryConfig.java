package com.example.departmentmanager.config;

import com.cloudinary.Cloudinary;
import jakarta.validation.Valid;
import lombok.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class CloudinaryConfig {
    @Value("${cloudinary.cloud-name}")
    private String cloudName ;
    @Value("${cloudinary.api-key}")
    private String apiKey ;
    @Value("${cloudinary.api-secret}")
    private String apiSecret  ;

    @Bean
    public Cloudinary cloudinary() {
        return new Cloudinary(Map.of(
                "cloud_name", cloudName ,
                "api_key", apiKey ,
                "api_secret", apiSecret



        )) ;
    }
}
