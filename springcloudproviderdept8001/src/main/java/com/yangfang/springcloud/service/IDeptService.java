package com.yangfang.springcloud.service;

import com.yangfang.springcloud.bean.Dept;

import java.util.List;

public interface IDeptService {

    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();
}
