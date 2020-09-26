package com.personal.knowledge.system;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.config.DependencyDescriptor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
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

        // 实际开发使用相关还是应付面试？二八原则？费曼学习法

        // Spring : https://www.cnblogs.com/toby-xu/category/1520341.html
        // 找源码 不是读源码。
        // 关注点：整体项目架构、整体逻辑结构、入口、主方法、入参出参、核心逻辑、深度、看一便Debug一遍完事儿。
        // 目的：能够借鉴的代码风格及设计思想，Bug解决，应付面试。

        /*
            1.解析web.xml
            2.往ServletContext实例中注入<context-param> 参数
            3.回调Servlet3.0的ServletContainerInitializers接口实现类的onStartup方法
            4.触发 Listener 事件(beforeContextInitialized, afterContextInitialized); 这里只会触发 ServletContextListener 类型的
            5.初始化 Filter, 调用其init方法
            6.加载 启动时即加载的servlet
        */

        //ServletContainerInitializer 是 Servlet 3.0 新增的一个接口，主要用于在容器启动阶段通过编程风格注册Filter, Servlet以及Listener。
        //指定在Web应用程序启动时初始化IOC容器
        //ServletContextListener 接口里的函数会结合Web容器的生命周期被调用,在服务器启动时，ServletContext被创建的时候，服务器关闭时，ServletContext将被销毁的时候等
        //读取在contextConfigLocation中定义的xml文件,自动装配ApplicationContext的配置信息,并产生WebApplicationContext对象,然后将这个对象放置在ServletContext的属性里
        //扫描@Configuration  注解的类  注入IOC容器

        //Spring启动的入口：
        SpringServletContainerInitializer springServletContainerInitializer = new SpringServletContainerInitializer();
        WebApplicationInitializer webApplicationInitializer;

        ContextLoader contextLoader = new ContextLoader();
        ServletContextListener servletContextListener;
        ContextLoaderListener cl = new ContextLoaderListener();

        //IOC:  refresh()
        DefaultListableBeanFactory IOC = new DefaultListableBeanFactory();
        //  https://blog.csdn.net/andy_zhang2007/article/details/78549773
        //ConfigurationClassParser parser=new ConfigurationClassParser();
        //ComponentScanAnnotationParser parser1=new ComponentScanAnnotationParser();
        //ComponentScanAnnotationParser parser=new ComponentScanAnnotationParser();

        AnnotationConfigWebApplicationContext configWebApplicationContext = new AnnotationConfigWebApplicationContext();
        AnnotationConfigApplicationContext configApplicationContext=new AnnotationConfigApplicationContext();
        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext();

        ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(null);

        //DI: getBean()  doCreateBean()  population()
        AutowiredAnnotationBeanPostProcessor aabp=new AutowiredAnnotationBeanPostProcessor();  //findAutowiringMetadata()  -->  buildAutowiringMetadata()
        DependencyDescriptor dependencyDescriptor=new DependencyDescriptor(null);  //resolveCandidate()  -->  beanFactory.getBean()

        DispatcherServlet ds = new DispatcherServlet();
        ApplicationContext app = new ClassPathXmlApplicationContext("");
        ApplicationContext app1 = new AnnotationConfigApplicationContext();
        ApplicationContext app2 = new AnnotationConfigWebApplicationContext();

    }
}