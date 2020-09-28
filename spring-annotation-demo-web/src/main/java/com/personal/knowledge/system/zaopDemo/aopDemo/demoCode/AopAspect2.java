package com.personal.knowledge.system.zaopDemo.aopDemo.demoCode;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-28 15:11
 **/
@Aspect
@Component
public class AopAspect2 {
    /**
     *  @target：匹配目标对象类型是否有指定的注解
     */
    @Pointcut("@target(com.personal.knowledge.system.zaopDemo.aopDemo.annotation.ClassFalg)")
    public void pointCutTargetAnno(){}

    @Before("pointCutTargetAnno()")
    public void before(){
        System.out.println("before() ");
    }

    @Before("pointCutTargetAnno()")
    public void after(){
        System.out.println("after() ");
    }

}