package com.yangfang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yang fang
 * @version 0.0.1
 * @date 2019-08-06 10:34
 */
@SpringBootApplication
@EnableEurekaServer
public class Springcloudeurekaservice7002 {

    public static void main(String[] args) {
        SpringApplication.run(Springcloudeurekaservice7002.class,args);
    }

}
