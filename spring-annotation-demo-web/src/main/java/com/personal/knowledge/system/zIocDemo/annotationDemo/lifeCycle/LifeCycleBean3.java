package com.personal.knowledge.system.zIocDemo.annotationDemo.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-23 20:29
 **/
public class LifeCycleBean3 {
    public LifeCycleBean3(){
        System.out.println("LifeCycleBean3 Constructor");
    }

    @PostConstruct
    public void init(){
        System.out.println("LifeCycleBean3 init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("LifeCycleBean3 destroy");
    }
}
