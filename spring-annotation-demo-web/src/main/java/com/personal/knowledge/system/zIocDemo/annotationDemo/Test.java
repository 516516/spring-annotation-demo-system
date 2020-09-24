package com.personal.knowledge.system.zIocDemo.annotationDemo;

import com.personal.knowledge.system.zIocDemo.annotationDemo.autoware.PrincipleConfig;
import com.personal.knowledge.system.zIocDemo.annotationDemo.aware.LifeCycleBean3Aware;
import com.personal.knowledge.system.zIocDemo.annotationDemo.lifeCycle.LifeCycleBean3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-23 17:45
 **/
public class Test {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext ap2 = new AnnotationConfigApplicationContext(IocConfig.class,IocConfig2.class);
//        AnnotationConfigApplicationContext ap2 = new AnnotationConfigApplicationContext(AddBeanToIocContainerFunc.class);
//        AnnotationConfigApplicationContext ap2 = new AnnotationConfigApplicationContext(AddBeanToIocContainerFunc.class);
//        System.out.println(ap2.getBean("addBeanToIocContainerFunc"));
//        System.out.println(ap2.getBean("&addBeanToIocContainerFunc"));
        AnnotationConfigApplicationContext ap2 = new AnnotationConfigApplicationContext(PrincipleConfig.class);
//        ap2.getBean(LifeCycleBean3.class);

        LifeCycleBean3Aware aware=new LifeCycleBean3Aware();
        aware.t1();

        System.out.println(Bean.class.getName());
    }
}
