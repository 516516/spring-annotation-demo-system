package com.personal.knowledge.system.zdiDemo;

import com.personal.knowledge.system.zdiDemo.annotationSingletonField.A;
import com.personal.knowledge.system.zdiDemo.annotationSingletonField.B;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-25 15:47
 **/
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext app=new AnnotationConfigApplicationContext(A.class, B.class);
        A a=app.getBean(A.class);
        B b=app.getBean(B.class);
    }

}