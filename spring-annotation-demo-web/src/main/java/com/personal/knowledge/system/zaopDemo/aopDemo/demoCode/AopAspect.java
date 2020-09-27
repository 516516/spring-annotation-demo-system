package com.personal.knowledge.system.zaopDemo.aopDemo.demoCode;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-27 10:47
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


@Aspect
@Component
public class AopAspect {

    //execution:可以精确到方法的返回值，参数个数、修饰符、参数类型等
    @Pointcut("execution(* com.personal.knowledge.system.zaopDemo.aopDemo.demoCode.*.*(..))")
    public void pointCutExecution(){}

    //within:与execution相比，粒度更大，仅能实现到包和接口、类级别
    @Pointcut("within(com.personal.knowledge.system.zaopDemo.aopDemo.demoCode.AopServiceImpl)")
    public void pointCutWithin(){}

    /**
     * Limits matching to join points (the execution of methods when using Spring AOP) where the bean reference (Spring AOP proxy) is an instance of the given type.
     * 用于匹配当前AOP代理对象类型的执行方法；注意是AOP代理对象的类型匹配
     * @EnableAspectJAutoProxy(proxyTargetClass = true)，则用CGLIB代理，而CGLIB继承被代理的类来实现，所以this能匹配到
     * @EnableAspectJAutoProxy，默认proxyTargetClass = false，如果基于接口则用JDK代理，所以this匹配不到
     */
    @Pointcut("this(com.personal.knowledge.system.zaopDemo.aopDemo.demoCode.AopServiceImpl)")
    public void pointCutThis(){}

    /**
     * Limits matching to join points (the execution of methods when using Spring AOP) where the target object (application object being proxied) is an instance of the given type.
     * 用于匹配当前目标对象类型的执行方法
     */
    @Pointcut("target(com.personal.knowledge.system.zaopDemo.aopDemo.demoCode.AopServiceImpl)")
    public void pointCutTarget(){}

    /**
     * Limits matching to join points (the execution of methods when using Spring AOP) where the arguments are instances of the given types.
     * 用于匹配当前执行的方法传入的参数为指定类型的执行方法
     */
    @Pointcut("args(java.lang.String)")
    public void pointCutArgs(){}

    /**
     * Limits matching to join points where the subject of the join point (the method being executed in Spring AOP) has the given annotation.
     * 用于匹配当前执行方法持有指定注解的方法（注解作用在方法上面）；
     */
    @Pointcut("@annotation(com.personal.knowledge.system.zaopDemo.aopDemo.annotation.FuncFlag)")
    public void pointCutAnno(){}

    /**
     * @within：用于匹配所持有指定注解类型内的所以连接点也就是方法（例子略）
     */
    @Pointcut("@within(com.personal.knowledge.system.zaopDemo.aopDemo.annotation.ClassFalg)")
    public void pointCutWithinAnno(){}

    /**
     *  @target：匹配目标对象类型是否有指定的注解
     */
    @Pointcut("@target(com.personal.knowledge.system.zaopDemo.aopDemo.annotation.ClassFalg)")
    public void pointCutTargetAnno(){}

    @Pointcut("@args(com.personal.knowledge.system.zaopDemo.aopDemo.annotation.ArgsFlag)")
    public void pointCutArgAnno(){}

    @Before("pointCutExecution()")
    public void before(){
        System.out.println("before  ++++++++++++++++++++++ ");
    }

    @AfterThrowing("pointCutExecution()")
    public void afterThrowing(){
        System.out.println("afterThrowing  +++++++++++++++++++++++++ ");
    }

    @AfterReturning("pointCutExecution()")
    public void afterReturning(){
        System.out.println("afterReturning  +++++++++++++++++++++++++ ");
    }

    @After("pointCutExecution()")
    public void after(){
        System.out.println("after  ++++++++++++++++++++++ ");
    }

    @Around("pointCutExecution()")
    public void around(){
        System.out.println("around  ++++++++++++++++++++++ ");
    }

}