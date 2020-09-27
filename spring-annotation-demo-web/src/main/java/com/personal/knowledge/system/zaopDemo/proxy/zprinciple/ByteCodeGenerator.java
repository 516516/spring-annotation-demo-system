package com.personal.knowledge.system.zaopDemo.proxy.zprinciple;

import com.personal.knowledge.system.zaopDemo.proxy.UserServiceImpl;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Modifier;
import java.nio.file.Files;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-27 09:30
 **/
public class ByteCodeGenerator {
    /**
     * 根据目标对象生成字节码(Jdk)
     *
     * @param target
     * @param <T>
     * @return
     */
    public static <T> byte[] generatorByteCodeByJdkProxy(T target) {
        int accessFlags = Modifier.PUBLIC | Modifier.FINAL;
        byte[] codes = ProxyGenerator.generateProxyClass("Proxy$" + target.getClass().getName(), target.getClass().getInterfaces(), accessFlags);
        return codes;
    }

    /**
     * 根据目标对象生成字节码(Cglib)
     * @param target
     * @param <T>
     * @return
     * @throws Exception
     */
    public static <T> byte[] generatorByteCodeByCglib(final T target) throws Exception {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> methodProxy.invoke(target,objects));
        enhancer.create();
        byte [] codes = enhancer.getStrategy().generate(enhancer);
        return codes;
    }

    public static void main(String[] args) {
        /**
         * 测试jdk
         */
        try {
            byte [] codes = ByteCodeGenerator.generatorByteCodeByJdkProxy(new UserServiceImpl());
            File file = new File("E:\\TEST\\Proxy$UserServiceImpl.class");
            System.out.println(file.getPath());
            Files.write(file.toPath(),codes);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /**
         * 测试cglib
         */
        try {
            FileOutputStream out = new FileOutputStream("E:\\TEST\\Cglib$UserServiceImpl.class");
            out.write(ByteCodeGenerator.generatorByteCodeByCglib(new UserServiceImpl()));
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
