package com.personal.knowledge.system.zIocDemo.annotationDemo.lifeCycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-23 20:23
 **/
@Configuration
public class LifeCycleConfig {

    /*   @Bean(initMethod = "init",destroyMethod = "destroy")
       public LifeCycleBean1 lifeCycleBean1(){
           return new LifeCycleBean1();
       }
   */

   /* @Bean
    public LifeCycleBean2 lifeCycleBean2() {
        return new LifeCycleBean2();
    }*/

    @Bean
    public LifeCycleBean3 lifeCycleBean3() {
        return new LifeCycleBean3();
    }

}
