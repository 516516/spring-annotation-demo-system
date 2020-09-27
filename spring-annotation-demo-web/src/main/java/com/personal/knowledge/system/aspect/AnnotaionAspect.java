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
//
//execution(modifiers-pattern? ret-type-pattern declaring-type-pattern?name-pattern(param-pattern) throws-pattern?)
//        这里问号表示当前项可以有也可以没有，其中各项的语义如下
//        modifiers-pattern：方法的可见性，如public，protected；
//        ret-type-pattern：方法的返回值类型，如int，void等；
//        declaring-type-pattern：方法所在类的全路径名，如com.spring.Aspect；
//        name-pattern：方法名类型，如buisinessService()；
//        param-pattern：方法的参数类型，如java.lang.String；
//        throws-pattern：方法抛出的异常类型，如java.lang.Exception；

//        example:
//@Pointcut("execution(* com.toby.dao.*.*(..))")//匹配com.toby.dao包下的任意接口和类的任意方法
//@Pointcut("execution(public * com.toby.dao.*.*(..))")//匹配com.toby.dao包下的任意接口和类的public方法
//@Pointcut("execution(public * com.toby.dao.*.*())")//匹配com.toby.dao包下的任意接口和类的public 无方法参数的方法
//@Pointcut("execution(* com.toby.dao.*.*(java.lang.String, ..))")//匹配com.toby.dao包下的任意接口和类的第一个参数为String类型的方法
//@Pointcut("execution(* com.toby.dao.*.*(java.lang.String))")//匹配com.toby.dao包下的任意接口和类的只有一个参数，且参数为String类型的方法
//@Pointcut("execution(* com.toby.dao.*.*(java.lang.String))")//匹配com.toby.dao包下的任意接口和类的只有一个参数，且参数为String类型的方法
//@Pointcut("execution(public * *(..))")//匹配任意的public方法
//@Pointcut("execution(* te*(..))")//匹配任意的以te开头的方法
//@Pointcut("execution(* com.toby.dao.IndexDao.*(..))")//匹配com.toby.dao.IndexDao接口中任意的方法
//@Pointcut("execution(* com.toby.dao..*.*(..))")//匹配com.toby.dao包及其子包中任意的方法
//关于这个表达式的详细写法,可以参考官网：https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html#aop-pointcuts-examples

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
