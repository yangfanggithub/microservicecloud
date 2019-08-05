package com.yangfang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Springcloudeurekaservice7001Application {

    public static void main(String[] args) {
        SpringApplication.run(Springcloudeurekaservice7001Application.class, args);
    }

}
