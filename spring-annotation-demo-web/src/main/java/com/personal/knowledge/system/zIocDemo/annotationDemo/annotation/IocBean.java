package com.personal.knowledge.system.zIocDemo.annotationDemo.annotation;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-23 17:41
 **/
public class IocBean {

    private String name="boubou";
    private Integer age=23;

    public IocBean() {
        System.out.println("IocBean  create() ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
