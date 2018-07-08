package com.originaldreams.serviceregistrycenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceregistrycenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceregistrycenterApplication.class, args);
    }
}
