package com.ecommerce.productservicedemo.configurations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfig {
    @Bean //denotes that this method is a bean producer
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
/*
This is a configuration class in SpringBoot application
it is annotated with @Configuration
It provides bean definitions and configuration for the application context
So its a class that is the source of beans
@Bean denotes that this method is a bean producer, this method name(here getRestTemplate)
is used for default bean name in the application.
 */