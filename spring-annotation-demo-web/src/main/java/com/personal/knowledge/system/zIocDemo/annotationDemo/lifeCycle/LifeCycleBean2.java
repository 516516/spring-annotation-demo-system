package com.personal.knowledge.system.zIocDemo.annotationDemo.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-23 20:26
 **/
public class LifeCycleBean2 implements InitializingBean, DisposableBean {

    public LifeCycleBean2() {
        System.out.println("LifeCycleBean2  construct");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("LifeCycleBean2 destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("LifeCycleBean2 afterPropertiesSet");
    }
}
