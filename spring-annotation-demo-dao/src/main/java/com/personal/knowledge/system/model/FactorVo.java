package com.personal.knowledge.system.model;

import java.util.List;

/**
 * @program: demo-pom
 * @description: factorList类
 * @author: bo.hu
 * @create: 2020-03-03 09:28
 **/
public class FactorVo extends Factor {
    private List<Math> mathList;

    public List<Math> getMathList() {
        return mathList;
    }

    public void setMathList(List<Math> mathList) {
        this.mathList = mathList;
    }
}
