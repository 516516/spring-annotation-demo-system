package com.personal.knowledge.system.zaopDemo.aopDemo.demoCode;

import com.personal.knowledge.system.zaopDemo.aopDemo.annotation.ArgsClass;
import com.personal.knowledge.system.zaopDemo.aopDemo.annotation.ClassFalg;
import com.personal.knowledge.system.zaopDemo.aopDemo.annotation.FuncFlag;
import org.springframework.stereotype.Service;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-27 10:51
 **/
@Service
@ClassFalg
public class AopServiceImpl implements AopService {

    @Override
    @FuncFlag
    public void say(String  name){
        System.out.println("he  say:  "+name);
    }

    @Override
    public void say(){
        System.out.println("无参执行");
    }

    @Override
    public void agrsAnno(ArgsClass argsClass) {
        System.out.println("参数注解使用");
    }

}