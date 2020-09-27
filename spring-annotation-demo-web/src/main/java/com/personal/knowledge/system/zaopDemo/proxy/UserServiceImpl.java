package com.personal.knowledge.system.zaopDemo.proxy;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-26 16:35
 **/
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("执行 UserServiceImpl 的 add() 方法");
    }

    @Override
    public String say(String name) {
        System.out.println("执行 UserServiceImpl 的 say() 方法");
        return "hello  "+name;
    }
}
