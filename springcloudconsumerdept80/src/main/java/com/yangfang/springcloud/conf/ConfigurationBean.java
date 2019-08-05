package com.yangfang.springcloud.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigurationBean {

    @Bean
    public RestTemplate template(){
        return new RestTemplate();
    };


}
