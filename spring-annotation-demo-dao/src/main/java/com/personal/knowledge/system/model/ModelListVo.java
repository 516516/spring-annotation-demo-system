package com.personal.knowledge.system.model;

import java.util.List;

/**
 * @program: demo-pom
 * @description: 多对多实体实现
 * @author: bo.hu
 * @create: 2020-03-03 09:28
 **/
public class ModelListVo extends Model{
    private List<FactorVo> factorVoList;

    public List<FactorVo> getFactorVoList() {
        return factorVoList;
    }

    public void setFactorVoList(List<FactorVo> factorVoList) {
        this.factorVoList = factorVoList;
    }
}
