package com.personal.knowledge.system.zaopDemo.aopDemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-27 10:46
 **/
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = false)
@ComponentScan(basePackages = "com.personal.knowledge.system.zaopDemo.aopDemo.demoCode")
public class AopConfig {

}
