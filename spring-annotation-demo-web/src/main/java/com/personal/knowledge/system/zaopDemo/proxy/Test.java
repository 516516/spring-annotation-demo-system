package com.personal.knowledge.system.zaopDemo.proxy;

import com.personal.knowledge.system.zaopDemo.proxy.cglib_dynamicProxy.CglibDynamicProxy;
import com.personal.knowledge.system.zaopDemo.proxy.jdk_dynamicProxy.JdkDynamicProxy;
import com.personal.knowledge.system.zaopDemo.proxy.static_proxy.StaticProxy;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-26 16:34
 **/
public class Test {
    public static void main(String[] args) {
        StaticProxy staticProxy=new StaticProxy(new UserServiceImpl());
        staticProxy.add();

        UserService userService= (UserService) new JdkDynamicProxy().createProxyInstance(new UserServiceImpl());
        userService.add();

        UserService userService1= (UserService) new CglibDynamicProxy().createCglibDynamicProxy(new UserServiceImpl());
        userService1.add();
    }
}