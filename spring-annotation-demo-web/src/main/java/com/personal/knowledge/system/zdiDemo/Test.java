package com.personal.knowledge.system.zdiDemo;

import com.personal.knowledge.system.zdiDemo.annotationSingletonField.AA;
import com.personal.knowledge.system.zdiDemo.annotationSingletonField.BB;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-25 15:47
 **/
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext app=new AnnotationConfigApplicationContext(AA.class, BB.class);
        AA a=app.getBean(AA.class);
        BB b=app.getBean(BB.class);
    }

}