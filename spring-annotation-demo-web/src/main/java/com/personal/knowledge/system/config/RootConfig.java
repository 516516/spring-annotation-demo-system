package com.personal.knowledge.system.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-21 14:28
 **/
@Configuration
@ComponentScan(basePackages = {"com.personal.knowledge.system.aspect",
        "com.personal.knowledge.system.config",
        "com.personal.knowledge.system.controller",
        "com.personal.knowledge.system.interceptor",
        "com.personal.knowledge.system.service"},
excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class))
public class RootConfig {
}
