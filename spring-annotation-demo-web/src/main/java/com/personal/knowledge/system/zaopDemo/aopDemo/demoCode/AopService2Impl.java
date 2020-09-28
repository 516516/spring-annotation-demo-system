package com.personal.knowledge.system.zaopDemo.aopDemo.demoCode;

import com.personal.knowledge.system.zaopDemo.aopDemo.annotation.ClassFalg;
import org.springframework.stereotype.Service;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-28 15:16
 **/
@Service
@ClassFalg
public class AopService2Impl implements AopService2 {
    @Override
    public void say2() {
        System.out.println("hag;ha;gkhda;ghd;slkhg;lsahg;lkashd;lkfsaa");
    }
}
