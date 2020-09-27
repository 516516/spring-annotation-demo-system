package com.personal.knowledge.system.zaopDemo.proxy.javassist;

import javassist.util.proxy.ProxyFactory;
import javassist.util.proxy.ProxyObject;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-27 10:05
 **/
public class JavassistDynamicProxy {
    /**
     * 创建Javassist动态代理
     * @param targetObject
     * @throws Exception
     * @return
     */
    public Object createJavassistDynamicProxy(final Object targetObject)throws Exception {
        ProxyFactory factory = new ProxyFactory();
        factory.setInterfaces(targetObject.getClass().getInterfaces());
        Class<?> proxyClass = factory.createClass();
        Object javassistProxy = proxyClass.newInstance();
        ((ProxyObject)javassistProxy).setHandler((self, thisMethod, proceed, args)-> {
            //写对应的增强代码
            System.out.println("Javassist日志记录开始");
            //调用真正的业务方法
            Object obj = thisMethod.invoke(targetObject,args);
            System.out.println("Javassist日志记录结束");
            return obj;
        });
        return javassistProxy;
    }
}
