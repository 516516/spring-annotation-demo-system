package com.personal.knowledge.system.zIocDemo.annotationDemo.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-23 19:16
 **/
@Configuration
public class IocConfig2 {

    @Bean
//    @Conditional(IocBeanCondition.class)
    public IocBean2 getBean2() {
        return new IocBean2();
    }
}
