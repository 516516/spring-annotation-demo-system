package com.personal.knowledge.system;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContextListener;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-21 14:14
 **/
public class TomcatService {
    public static void main(String[] args) {

        /*
            1.解析web.xml
            2.往ServletContext实例中注入<context-param> 参数
            3.回调Servlet3.0的ServletContainerInitializers接口实现类的onStartup方法
            4.触发 Listener 事件(beforeContextInitialized, afterContextInitialized); 这里只会触发 ServletContextListener 类型的
            5.初始化 Filter, 调用其init方法
            6.加载 启动时即加载的servlet
        */


        //ServletContainerInitializer 是 Servlet 3.0 新增的一个接口，主要用于在容器启动阶段通过编程风格注册Filter, Servlet以及Listener。
        //Spring启动的入口：
        SpringServletContainerInitializer springServletContainerInitializer=new SpringServletContainerInitializer();
        WebApplicationInitializer webApplicationInitializer;
        AnnotationConfigWebApplicationContext configWebApplicationContext=new AnnotationConfigWebApplicationContext();


        //指定在Web应用程序启动时载入Ioc容器
        //ServletContextListener 接口里的函数会结合Web容器的生命周期被调用,在服务器启动时，ServletContext被创建的时候，服务器关闭时，ServletContext将被销毁的时候等
        //读取在contextConfigLocation中定义的xml文件,自动装配ApplicationContext的配置信息,并产生WebApplicationContext对象,然后将这个对象放置在ServletContext的属性里
        ContextLoader contextLoader=new ContextLoader();
        ServletContextListener servletContextListener;
        ContextLoaderListener cl=new ContextLoaderListener();


        //
        DispatcherServlet ds=new DispatcherServlet();
        ApplicationContext app=new ClassPathXmlApplicationContext("");
        ApplicationContext app1=new AnnotationConfigApplicationContext();
        ApplicationContext app2=new AnnotationConfigWebApplicationContext();

    }
}