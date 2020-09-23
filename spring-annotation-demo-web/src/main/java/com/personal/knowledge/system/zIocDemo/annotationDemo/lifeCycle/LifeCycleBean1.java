package com.personal.knowledge.system.zIocDemo.annotationDemo.lifeCycle;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-23 20:22
 **/
public class LifeCycleBean1 {

    public LifeCycleBean1() {
        System.out.println("LifeCycleBean1  construct");
    }

    public void init() {
        System.out.println("LifeCycleBean1 Init");
    }

    public void destroy() {
        System.out.println("LifeCycleBean1 Destroy");
    }
    
}
