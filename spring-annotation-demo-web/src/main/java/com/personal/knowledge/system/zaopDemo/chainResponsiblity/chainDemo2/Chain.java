package com.personal.knowledge.system.zaopDemo.chainResponsiblity.chainDemo2;

import java.util.*;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-28 17:44
 **/
public class Chain {
    private List<ChainBaseHandler> handlerList;
    private int index=-1;

    public Chain(List<ChainBaseHandler> handlerList) {
        this.handlerList = handlerList;
    }

    public void proceed() {
        if(index==handlerList.size()-1){
            return ;
        }
        handlerList.get(++index).execute(this);
    }
}
