package com.personal.knowledge.system.zIocDemo.annotationDemo.autoware;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-23 21:04
 **/

//自动装配：
public class AutoAwareDemo {
    //　① @Autowired 默认情况下：首先是按照类型进行装配，若在IOC容器中发现了多个相同类型的组件，那么就按照属性名称来进行装配。
    //  ② @Autowired 假设我们需要指定特定的组件来进行装配，我们可以通过使用@Qualifier("tobyDao")来指定装配的组件或者在配置类上的@Bean加上@Primary注解
    //  ③ 假设我们指定Autowire.BY_TYPE，这时候容器出现2个及以上,那么在装配的时候就会抛出异常
    //  ④ @Resource(JSR250规范)功能和@AutoWired的功能差不多一样，但是不支持@Primary和@Qualifier的支持
    //  ⑤ @Inject(JSR330规范)需要导入jar包依赖功能和支持@Primary功能，但是没有Require=false的功能
}
