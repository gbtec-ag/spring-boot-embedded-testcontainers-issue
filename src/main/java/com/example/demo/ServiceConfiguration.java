package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ServiceConfiguration {

    @Bean(destroyMethod = "destroy")
    ServiceBean serviceBean() {
        return new ServiceBean();
    }
}
