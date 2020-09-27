package com.personal.knowledge.system.zaopDemo.proxy.jdk_dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-26 16:46
 **/

/**
 * JDK动态代理 实现一个接口：InvocationHandler
 * JDK的动态代理机制只能代理实现了接口的类，而没有实现接口的类就不能实现JDK的动态代理
 * 字节码：UserServiceImpl extends Proxy implements UserService
 *          方法数量会比接口定义中多三个， hashCode(),  toString(),  equals()
 */
public class JdkDynamicProxy implements InvocationHandler {

    private Object targetObject;

    public Object createProxyInstance(final Object targetObject) {
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(this.targetObject.getClass().getClassLoader(),this.targetObject.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Jdk日志记录开始");
        Object obj=method.invoke(this.targetObject,args);
        System.out.println("Jdk日志记录结束");
        return obj;
    }

}
