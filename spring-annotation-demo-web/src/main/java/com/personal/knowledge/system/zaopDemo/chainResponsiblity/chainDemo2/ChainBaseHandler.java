package com.personal.knowledge.system.zaopDemo.chainResponsiblity.chainDemo2;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-28 17:43
 **/
public abstract class ChainBaseHandler{
    public void execute(Chain chain){
        handlerProcess();
        chain.proceed();
    }
    protected abstract void handlerProcess();
}
