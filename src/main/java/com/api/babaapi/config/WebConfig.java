package com.api.babaapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web. servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig  implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Aplica a todos os endpoints
                .allowedMethods("GET", "POST", "PUT", "DELETE");

//                .allowedHeaders("Content-Type", "Authorization")
//                .exposedHeaders("Custom-Header")
//                .allowCredentials(true)
//                .maxAge(3600);
    }
}
