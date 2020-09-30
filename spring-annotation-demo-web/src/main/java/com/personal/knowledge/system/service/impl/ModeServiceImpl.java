package com.personal.knowledge.system.service.impl;

import com.personal.knowledge.system.mapper.ModelMapper;
import com.personal.knowledge.system.model.Model;
import com.personal.knowledge.system.service.ModelService;
import com.personal.knowledge.system.service.TransactionalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-21 15:03
 **/
@Service
@Slf4j
public class ModeServiceImpl implements ModelService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    TransactionalService transactionalService;

    @Override
    public Model testDemo(Long modelId) {
        Model model=modelMapper.selectByPrimaryKey(modelId);
        return model;
    }

    @Override
    public void f() {
        System.out.println("f()");
    }

    @Override
    public void addModel(Model model) {
        modelMapper.insertSelective(model);
        try {
//            transactionalService.addMath();
        } catch (Exception e) {
            log.error("异常了，异常信息：",e);
        }
    }

}
