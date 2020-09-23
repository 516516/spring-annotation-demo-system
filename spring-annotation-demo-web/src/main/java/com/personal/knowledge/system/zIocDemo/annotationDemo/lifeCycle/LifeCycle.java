package com.personal.knowledge.system.zIocDemo.annotationDemo.lifeCycle;

import org.springframework.context.SmartLifecycle;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-23 21:05
 **/

// 主要方法：isAutoStartup()返回true时，Spring容器启动时会去执行start()方法。
// isRunning()返回true的时候，容器销毁时会调用stop()方法。

public class LifeCycle implements SmartLifecycle {
    @Override
    public boolean isAutoStartup() {
        return false;
    }

    @Override
    public void stop(Runnable callback) {

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isRunning() {
        return false;
    }

    @Override
    public int getPhase() {
        return 0;
    }
}
