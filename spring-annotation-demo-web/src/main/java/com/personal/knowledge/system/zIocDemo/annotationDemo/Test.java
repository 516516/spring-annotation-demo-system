package com.personal.knowledge.system.zIocDemo.annotationDemo;

import com.personal.knowledge.system.zIocDemo.annotationDemo.annotation.IocBean;
import com.personal.knowledge.system.zIocDemo.annotationDemo.autoware.PrincipleConfig;
import com.personal.knowledge.system.zIocDemo.annotationDemo.aware.LifeCycleBean3Aware;
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
        AnnotationConfigApplicationContext ap2 = new AnnotationConfigApplicationContext(IocBean.class);
        IocBean bean=ap2.getBean(IocBean.class);
        System.out.println(bean.getName());

    }
}
