package com.personal.knowledge.system.zaopDemo.aopDemo;

import com.personal.knowledge.system.zaopDemo.aopDemo.annotation.ArgsClass;
import com.personal.knowledge.system.zaopDemo.aopDemo.demoCode.AopService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-27 10:55
 **/
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        AopService demo = (AopService) context.getBean("aopServiceImpl");
        demo.say("hagha;ghas;gfha;sdha;ghas");
        demo.say();
        demo.agrsAnno(new ArgsClass());
    }
}