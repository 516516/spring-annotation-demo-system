package com.personal.knowledge.system.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: demo-pom
 * @description: 拓展model
 * @author: bo.hu
 * @create: 2019-09-17 15:36
 **/
public class ModelVo extends Model{
    private List<Factor> factorList=new ArrayList<>();

    public List<Factor> getFactorList() {
        return factorList;
    }

    public void setFactorList(List<Factor> factorList) {
        this.factorList = factorList;
    }
}
