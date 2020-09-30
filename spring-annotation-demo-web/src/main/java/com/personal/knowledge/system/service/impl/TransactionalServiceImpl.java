package com.personal.knowledge.system.service.impl;

import com.personal.knowledge.system.service.TransactionalService;
import org.springframework.stereotype.Service;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-30 13:29
 **/
@Service
public class TransactionalServiceImpl implements TransactionalService {

    @Override
    public void addMath() {
        System.out.println(1/0);
    }

}