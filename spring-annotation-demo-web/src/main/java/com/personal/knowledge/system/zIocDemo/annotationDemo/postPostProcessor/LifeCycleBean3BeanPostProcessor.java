package com.personal.knowledge.system.zIocDemo.annotationDemo.postPostProcessor;

import com.personal.knowledge.system.zIocDemo.annotationDemo.lifeCycle.LifeCycleBean3;
import com.personal.knowledge.system.zIocDemo.annotationDemo.lifeCycle.LifeCycleConfig;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-23 20:35
 **/
//Bean后置处理器：具体为Bean初始化前后 触发。
public class LifeCycleBean3BeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof LifeCycleConfig){
            System.out.println("马上开始初始化LifeCycleBean3了，注意下");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof LifeCycleConfig){
            System.out.println("初始化完成LifeCycleBean3了，注意下");
        }
        return bean;
    }
}
