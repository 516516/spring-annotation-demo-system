package com.personal.knowledge.system.zIocDemo.annotationDemo.postPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;


/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-23 20:37
 **/
// BeanFactoryPostProcessor：Bean工厂的后置处理器，触发时机bean定义注册之后bean实例化之前
@Component
public class LifeCycleBean3BeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("调用了 LifeCycleBean3BeanFactoryPostProcessor 的postProcessBeanFactory方法");
        for(String beanName : beanFactory.getBeanDefinitionNames()){
            if("lifeCycleConfig".equals(beanName)){
                BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
                beanDefinition.setLazyInit(true);
            }
        }
    }
}
