package com.lizhi.register_and_discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegisterAndDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterAndDiscoveryApplication.class, args);
    }
}
