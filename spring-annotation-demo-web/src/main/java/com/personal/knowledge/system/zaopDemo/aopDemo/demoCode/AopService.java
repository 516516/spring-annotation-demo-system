package com.personal.knowledge.system.zaopDemo.aopDemo.demoCode;

import com.personal.knowledge.system.zaopDemo.aopDemo.annotation.ArgsClass;
import com.personal.knowledge.system.zaopDemo.aopDemo.annotation.ClassFalg;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-27 11:16
 **/
public interface AopService {
    public void say(String name);

    public void say();

    public void agrsAnno(ArgsClass argsClass);
}
