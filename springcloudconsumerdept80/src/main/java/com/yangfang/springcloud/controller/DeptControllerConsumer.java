package com.yangfang.springcloud.controller;

import com.yangfang.springcloud.bean.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer/dept")
public class DeptControllerConsumer {

    //private static final String REQUEST_URL="http://localhost:8081/dept";
    private static final String REQUEST_URL="http://PROVIDER-DEPT-8001";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REQUEST_URL+"/dept/add",dept, Boolean.class);
    }

    @GetMapping("/get/{id}")
    public Dept get(@PathVariable String id){
        return restTemplate.getForObject(REQUEST_URL+"/dept/get/"+id,Dept.class);
    }

}
