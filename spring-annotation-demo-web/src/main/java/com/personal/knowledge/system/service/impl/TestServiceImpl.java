package com.personal.knowledge.system.service.impl;

import com.personal.knowledge.system.service.TestService;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-22 10:18
 **/
public class TestServiceImpl implements TestService {
    @Override
    public void f2() {
        System.out.println("f2()");
    }
}
