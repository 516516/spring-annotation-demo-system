package com.personal.knowledge.system.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @program: spring-annotation-demo-pom
 * @description: aop配置
 * @author: bo.hu
 * @create: 2020-09-22 09:54
 **/
@Component
@Aspect
@Slf4j
public class AnnotaionAspect {
    //配置切入点,该方法无方法体,主要为方便同类中其他方法使用此处配置的切入点
    @Pointcut("execution(* com.personal.knowledge.system.service.impl.*.*(..))")
    public void aspect(){ }

    /*
     * 配置前置通知,使用在方法 aspect()上注册的切入点
     * 同时接受 JoinPoint 切入点对象,可以没有该参数
     */
    @Before("aspect()")
    public void before(JoinPoint joinPoint){
        log.info("before 通知 " + joinPoint);
    }

    //配置后置通知,使用在方法 aspect()上注册的切入点
    @After("aspect()")
    public void after(JoinPoint joinPoint){
        log.info("after 通知 " + joinPoint);
    }
/*

    //配置环绕通知,使用在方法 aspect()上注册的切入点
    @Around("aspect()")
    public void around(JoinPoint joinPoint){
        long start = System.currentTimeMillis();
        try {
            ((ProceedingJoinPoint) joinPoint).proceed();
            long end = System.currentTimeMillis();
            log.info("around 通知 " + joinPoint + "\tUse time : " + (end - start) + " ms!");
        } catch (Throwable e) {
            long end = System.currentTimeMillis();
            log.info("around 通知 " + joinPoint + "\tUse time : " + (end - start) + " ms with exception :" + e.getMessage());
        }
    }
*/

    //配置后置返回通知,使用在方法 aspect()上注册的切入点
    @AfterReturning("aspect()")
    public void afterReturn(JoinPoint joinPoint){
        log.info("afterReturn 通知 " + joinPoint);
    }

    //配置抛出异常后通知,使用在方法 aspect()上注册的切入点
    @AfterThrowing(pointcut="aspect()", throwing="ex")
    public void afterThrow(JoinPoint joinPoint, Exception ex){
        log.info("afterThrow 通知 " + joinPoint + "\t" + ex.getMessage());
    }

}
