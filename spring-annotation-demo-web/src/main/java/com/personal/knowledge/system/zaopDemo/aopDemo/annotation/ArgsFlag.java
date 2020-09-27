package com.personal.knowledge.system.zaopDemo.aopDemo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-27 13:51
 **/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ArgsFlag {
}