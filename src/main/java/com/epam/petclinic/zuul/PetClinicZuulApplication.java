package com.epam.petclinic.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableEurekaClient
@EnableWebMvc
@EnableDiscoveryClient
@EnableZuulProxy
public class PetClinicZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetClinicZuulApplication.class, args);
    }
}
