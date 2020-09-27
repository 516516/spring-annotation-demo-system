package com.personal.knowledge.system.zaopDemo.proxy.static_proxy;

import com.personal.knowledge.system.zaopDemo.proxy.UserService;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-26 16:37
 **/
public class StaticProxy implements UserService {

    private UserService userService;

    public StaticProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        System.out.println("添加日志 开始");
        userService.add();
        System.out.println("添加日志 结束");
    }

    @Override
    public String say(String name) {
        System.out.println("添加日志 开始");
        String result=userService.say(name);
        System.out.println("添加日志 结束");
        return result;
    }
}
