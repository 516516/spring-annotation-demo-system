package com.personal.knowledge.system.zIocDemo.annotationDemo.aware;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-23 20:57
 **/
public class LifeCycleBean3Aware implements ApplicationContextAware {

    /**
     * spring上下文
     */
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("应用程序获取到了spring 容器");
        this.applicationContext = applicationContext;
    }

    public void t1(){
        System.out.println(applicationContext);
    }
}
