package com.personal.knowledge.system.zdiDemo.annotationSingletonField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-25 15:56
 **/

//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Service
public class AA {

    @Autowired
    BB b;

    ArrayList<String> testList;

    HashMap<String,String> testMap;

    String[] str;

    HashSet<Integer> set;

    String name;

    public void f(){
        System.out.println("A to B");
    }
}
