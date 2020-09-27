package com.personal.knowledge.system.zaopDemo.proxy.javassist;


import javassist.*;

import java.lang.reflect.Field;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-27 10:06
 **/
public class JavassistBytecodeDynamicProxy {
    /**
     * 创建Javassist字节码动态代理
     * @param targetObject
     * @return
     * @throws Exception
     */
    public static Object createJavassistBytecodeDynamicProxy(final Object targetObject) throws Exception {
        ClassPool pool = ClassPool.getDefault();
        CtClass proxyClass = pool.makeClass("JavassistProxy" +  "&" +targetObject.getClass().getName());
        proxyClass.addInterface(pool.get(targetObject.getClass().getInterfaces()[0].getName()));
        proxyClass.addConstructor(CtNewConstructor.defaultConstructor(proxyClass));
        proxyClass.addField(CtField.make("private " + targetObject.getClass().getName() + " targetObject;", proxyClass));
        proxyClass.addMethod(CtNewMethod.make("public void add() { \n" +
                "System.out.println(\"Javassist字节码日志记录开始\");\n" +
                "targetObject.add();\n" +
                "System.out.println(\"Javassist字节码日志记录结束\");\n"+
                "}", proxyClass));
        Class<?> clazz = proxyClass.toClass();
        Object bytecodeProxy = clazz.newInstance();
        Field field = bytecodeProxy.getClass().getDeclaredField("targetObject");
        field.setAccessible(true);
        field.set(bytecodeProxy,targetObject);
        return bytecodeProxy;
    }

    /**
     * 创建Javassist字节码动态代理2
     * @param targetObject
     * @return
     * @throws Exception
     */
    public static Object createJavassistBytecodeDynamicProxy2(final Object targetObject) throws Exception {
        ClassPool pool = ClassPool.getDefault();
        pool.appendSystemPath();
        CtClass ctl = pool.get(targetObject.getClass().getName());
        ctl.setName("JavassistProxy" +  "&" + targetObject.getClass().getName());
        CtMethod ctMethod = ctl.getDeclaredMethod("add");
        ctMethod.insertBefore("System.out.println(\"Javassist字节码2日志记录开始\");");
        ctMethod.insertAfter("System.out.println(\"Javassist字节码2日志记录结束\");");
        Class<?> clazz = ctl.toClass();
        Object bytecodeProxy = clazz.newInstance();
        return bytecodeProxy;
    }
}
