package com.personal.knowledge.system.zaopDemo.proxy.cglib_dynamicProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: spring-annotation-demo-pom
 * @description: CglibDynamicProxy
 *      CGLIB动态代理 cglib是针对类来实现代理的，他的原理是对指定的目标类生成一个子类，
 *      并覆盖其中方法实现增强，但因为采用的是继承，所以不能对final修饰的类进行代理
 *      字节码：UserServiceImpl$$EnhancerByCGLIB$$2c0e810b extends UserServiceImpl
 *      直接继承实现类，重写其中的方法。
 * @author: bo.hu
 * @create: 2020-09-27 09:15
 **/
public class CglibDynamicProxy implements MethodInterceptor {
    /**
     * 目标对象
     */
    private Object targetObject;

    public Object createCglibDynamicProxy(final Object targetObject){
        this.targetObject=targetObject;
        Enhancer enhancer =new Enhancer();
        enhancer.setSuperclass(this.targetObject.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("CGLIB 日志记录开始");
        Object objResult=proxy.invoke(this.targetObject, args);
        System.out.println("CGLIB 日志记录结束");
        return objResult;
    }

}