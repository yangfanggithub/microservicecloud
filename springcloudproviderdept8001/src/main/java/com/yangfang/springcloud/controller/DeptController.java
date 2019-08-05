package com.yangfang.springcloud.controller;

import com.yangfang.springcloud.bean.Dept;
import com.yangfang.springcloud.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private IDeptService deptService;

    @PostMapping("/add")
    public boolean addDept(@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/get/{id}")
    public Dept findById(@PathVariable Long id) {
        return deptService.findById(id);
    }

    @GetMapping("/get")
    public List<Dept> findAll() {
        return deptService.findAll();
    }

}
