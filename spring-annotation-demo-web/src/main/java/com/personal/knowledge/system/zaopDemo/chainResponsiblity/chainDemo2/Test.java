package com.personal.knowledge.system.zaopDemo.chainResponsiblity.chainDemo2;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-28 17:48
 **/
import  java.util.*;

public class Test {
    static class HandlerA extends ChainBaseHandler{

        @Override
        protected void handlerProcess() {
            System.out.println("handler by chain a");
        }
    }
    static class HandlerB extends ChainBaseHandler{

        @Override
        protected void handlerProcess() {
            System.out.println("handler by chain b");
        }
    }
    static class HandlerC extends ChainBaseHandler{

        @Override
        protected void handlerProcess() {
            System.out.println("handler by chain c");
        }
    }

    public static void main(String[] args) {
        List<ChainBaseHandler> handlerList= Arrays.asList(new HandlerA(),new HandlerB(),new HandlerC());
        Chain chain=new Chain(handlerList);
        chain.proceed();
    }
}
