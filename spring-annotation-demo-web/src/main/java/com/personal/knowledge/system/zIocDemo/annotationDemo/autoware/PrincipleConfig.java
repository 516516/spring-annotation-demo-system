package com.personal.knowledge.system.zIocDemo.annotationDemo.autoware;

import com.personal.knowledge.system.zIocDemo.annotationDemo.lifeCycle.LifeCycleBean3;
import com.personal.knowledge.system.zIocDemo.componentScanPkg.TDao;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-23 21:14
 **/
@Configuration
@ComponentScan(basePackages = {"com.personal.knowledge.system.zIocDemo.annotationDemo.postPostProcessor"})
public class PrincipleConfig {
    @Bean
    public TDao principleBean(){
        return new TDao();
    }

    @Bean(autowire = Autowire.BY_TYPE)
    public LifeCycleBean3 principleAspect(){
        return new LifeCycleBean3();
    }

    @Bean
    public TDao principleLog(){
        return new TDao();
    }

    @Bean
    public TDao principleLog2(){
        return new TDao();
    }
}