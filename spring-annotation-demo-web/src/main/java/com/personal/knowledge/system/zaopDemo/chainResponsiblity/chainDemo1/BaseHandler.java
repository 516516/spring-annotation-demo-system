package com.personal.knowledge.system.zaopDemo.chainResponsiblity.chainDemo1;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-28 17:24
 **/
public abstract class BaseHandler {

    /**
     * 当前对象执行完以后，下一个该谁执行，使用  nextHandler  显示的指定。
     */
    private BaseHandler nextHandler;

    public BaseHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(BaseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void execute() {
        process();
        if (nextHandler != null) {
            nextHandler.execute();
        }
    }

    protected abstract void process();

}