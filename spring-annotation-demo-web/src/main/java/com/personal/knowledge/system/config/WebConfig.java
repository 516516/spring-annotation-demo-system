package com.personal.knowledge.system.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-21 14:20
 **/
@Configuration
@ComponentScan("com.personal.knowledge.system") // 扫描路径  @Controller @Service @Component
@EnableWebMvc  // 开启注解驱动  <mvc:annotation-driven/>     原始的DispatcherServlet:  org.springframework.web.servlet.DispatcherServlet
@EnableAspectJAutoProxy(proxyTargetClass = true)  //开启AOP代理  设置proxyTargetClass=false，或默认为false，则是用JDK代理，否则使用的是CGLIB代理
public class WebConfig implements WebMvcConfigurer {

}