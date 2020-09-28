package com.personal.knowledge.system.zaopDemo.chainResponsiblity.chainDemo1;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-28 17:29
 **/
public class Client {
    static class HandlerA extends BaseHandler {
        @Override
        protected void process() {
            System.out.println("handle by a");
        }
    }

    static class HandlerB extends BaseHandler {
        @Override
        protected void process() {
            System.out.println("handle by b");
        }
    }

    static class HandlerC extends BaseHandler {
        @Override
        protected void process() {
            System.out.println("handle by c");
        }
    }

    public static void main(String[] args) {
        HandlerA handlerA = new HandlerA();
        HandlerB handlerB = new HandlerB();
        HandlerC handlerC = new HandlerC();
        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);
        handlerA.execute();
    }
}
