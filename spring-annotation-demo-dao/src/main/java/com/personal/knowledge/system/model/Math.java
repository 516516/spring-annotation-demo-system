package com.personal.knowledge.system.model;

import java.math.BigDecimal;
import java.util.Date;

public class Math {
    private Long id;

    private Long factorId;

    private BigDecimal column1;

    private BigDecimal column2;

    private BigDecimal column3;

    private String mathCode;

    private String mathName;

    private Date updateTime;

    private String updateUser;

    private Date createTime;

    private String createUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFactorId() {
        return factorId;
    }

    public void setFactorId(Long factorId) {
        this.factorId = factorId;
    }

    public BigDecimal getColumn1() {
        return column1;
    }

    public void setColumn1(BigDecimal column1) {
        this.column1 = column1;
    }

    public BigDecimal getColumn2() {
        return column2;
    }

    public void setColumn2(BigDecimal column2) {
        this.column2 = column2;
    }

    public BigDecimal getColumn3() {
        return column3;
    }

    public void setColumn3(BigDecimal column3) {
        this.column3 = column3;
    }

    public String getMathCode() {
        return mathCode;
    }

    public void setMathCode(String mathCode) {
        this.mathCode = mathCode == null ? null : mathCode.trim();
    }

    public String getMathName() {
        return mathName;
    }

    public void setMathName(String mathName) {
        this.mathName = mathName == null ? null : mathName.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }
}