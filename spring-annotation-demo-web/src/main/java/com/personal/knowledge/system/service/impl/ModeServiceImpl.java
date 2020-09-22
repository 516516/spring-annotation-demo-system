package com.personal.knowledge.system.service.impl;

import com.personal.knowledge.system.mapper.ModelMapper;
import com.personal.knowledge.system.model.Model;
import com.personal.knowledge.system.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-21 15:03
 **/
@Service
public class ModeServiceImpl implements ModelService {

    @Autowired
    ModelMapper modelMapper;

    @Override
    public Model testDemo(Long modelId) {
        Model model=modelMapper.selectByPrimaryKey(modelId);
        return model;
    }

    @Override
    public void f() {
        System.out.println("f()");
    }
}
