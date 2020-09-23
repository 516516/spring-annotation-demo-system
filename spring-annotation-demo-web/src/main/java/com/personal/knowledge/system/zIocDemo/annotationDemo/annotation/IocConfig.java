package com.personal.knowledge.system.zIocDemo.annotationDemo.annotation;

import com.personal.knowledge.system.zIocDemo.annotationDemo.Test;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-23 17:44
 **/

////包含用法：includeFilters，注意：若使用包含，需要把useDefaultFilters属性设置为false（true表示扫描全部的），后续源码解析会说到这个原因
//@ComponentScan(basePackages = {"com.personal.knowledge.system.zIocDemo.xmlDemo"}
//,includeFilters = {@ComponentScan.Filter(type=FilterType.ANNOTATION,value = {Controller.class})
//,@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value = {Test.class})},useDefaultFilters = false)

//自定义Filter用法：自定义一个TobyTypeFilter实现TypeFilter  类名称中包含Dao就可以被扫描到
//@ComponentScan(basePackages = {"com.personal.knowledge.system.zIocDemo.componentScanPkg"}
//        ,includeFilters = {@ComponentScan.Filter(type=FilterType.CUSTOM,value = {BoTypeFilter.class})},useDefaultFilters = false)

//这样在basePackages包下面具有@Controller @Service @Repository @Component注解的组件都会被加载到spring容器中
//排除用法：excludeFilters(排除@Controller注解和TobyService)
@ComponentScan(basePackages = {"com.personal.knowledge.system.zIocDemo.componentScanPkg"}
,excludeFilters = {@ComponentScan.Filter(type=FilterType.ANNOTATION,value = {Controller.class})
,@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value = {Test.class})})

@Configuration
public class IocConfig {

    @Bean
    @Scope("prototype")
    //@Scope指定的作用域取值：singleton 单实例的(默认)，prototype 多实例的，request 同一次请求，session 同一个会话级别
    //在不指定@Scope的情况下，所有的bean都是单实例的bean,而且是饿汉加载(容器启动实例就创建好了)
    //@Scope为prototype表示为多实例的，而且还是懒汉模式加载（IOC容器启动的时候，并不会创建对象，而是在每次使用的时候才会创建）注意：当指定多例的时候是无法解决循环依赖的后续源码会分析
    @Lazy
    //Bean的懒加载@Lazy(主要针对单实例的bean在容器启动的时候，不创建对象，而在第一次使用的时候才会创建该对象，多实例bean没有懒加载一说)
    @Conditional(IocBeanCondition.class)
    //@Conditional 条件注解     配置类 只有当容器中有IocConfig的时候才实例化IocBean
    public IocBean getBean() {
        return new IocBean();
    }

}
