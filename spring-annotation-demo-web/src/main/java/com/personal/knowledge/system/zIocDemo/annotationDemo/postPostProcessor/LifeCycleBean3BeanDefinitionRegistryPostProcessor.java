package com.personal.knowledge.system.zIocDemo.annotationDemo.postPostProcessor;

import com.personal.knowledge.system.zIocDemo.annotationDemo.lifeCycle.LifeCycleBean3;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-23 20:39
 **/
//BeanDefinitionRegistryPostProcessor：Bean定义的后置处理器，它继承了BeanFactoryPostProcessor，触发时机，在bean的定义注册之前
public class LifeCycleBean3BeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("调用LifeCycleBean3BeanDefinitionRegistryPostProcessor的postProcessBeanDefinitionRegistry方法");
        System.out.println("bean定义的数据量:"+registry.getBeanDefinitionCount());
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(LifeCycleBean3.class);
        registry.registerBeanDefinition("lifeCycleConfig",rootBeanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("调用LifeCycleBean3BeanDefinitionRegistryPostProcessor的postProcessBeanFactory方法");
        System.out.println(beanFactory.getBeanDefinitionCount());
    }
}
