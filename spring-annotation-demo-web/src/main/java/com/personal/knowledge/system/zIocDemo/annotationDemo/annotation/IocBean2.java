package com.personal.knowledge.system.zIocDemo.annotationDemo.annotation;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-23 18:21
 **/
public class IocBean2 {
    private  String name;
    private Integer age;
    private String image;

    public IocBean2() {
        System.out.println("IocBean2 create()");
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
