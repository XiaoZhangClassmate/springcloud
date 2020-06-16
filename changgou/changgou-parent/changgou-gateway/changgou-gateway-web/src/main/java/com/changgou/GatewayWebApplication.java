package com.changgou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayWebApplication<SpringBootApplication> {

    public static void main(String[] args) {
        SpringApplication.run(GatewayWebApplication.class,args);
    }
}
