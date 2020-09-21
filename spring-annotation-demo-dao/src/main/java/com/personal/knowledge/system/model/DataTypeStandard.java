package com.personal.knowledge.system.model;

import java.math.BigDecimal;
import java.util.Date;

public class DataTypeStandard {
    private Long id;

    private Integer intTest;

    private Byte tinyintTest;

    private Short smallintTest;

    private Integer mediumintTest;

    private Long bigintTest;

    private Integer integerTest;

    private Float floatTest;

    private Double doubleTest;

    private String charTest;

    private String varcharTest;

    private BigDecimal decimalTest;

    private BigDecimal numericTest;

    private Date yearTest;

    private Date dateTest;

    private Date timeTest;

    private Date datatimeTest;

    private Date timestampTest;

    private String createUser;

    private Long createId;

    private Date createTime;

    private String updateUser;

    private Long updateId;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIntTest() {
        return intTest;
    }

    public void setIntTest(Integer intTest) {
        this.intTest = intTest;
    }

    public Byte getTinyintTest() {
        return tinyintTest;
    }

    public void setTinyintTest(Byte tinyintTest) {
        this.tinyintTest = tinyintTest;
    }

    public Short getSmallintTest() {
        return smallintTest;
    }

    public void setSmallintTest(Short smallintTest) {
        this.smallintTest = smallintTest;
    }

    public Integer getMediumintTest() {
        return mediumintTest;
    }

    public void setMediumintTest(Integer mediumintTest) {
        this.mediumintTest = mediumintTest;
    }

    public Long getBigintTest() {
        return bigintTest;
    }

    public void setBigintTest(Long bigintTest) {
        this.bigintTest = bigintTest;
    }

    public Integer getIntegerTest() {
        return integerTest;
    }

    public void setIntegerTest(Integer integerTest) {
        this.integerTest = integerTest;
    }

    public Float getFloatTest() {
        return floatTest;
    }

    public void setFloatTest(Float floatTest) {
        this.floatTest = floatTest;
    }

    public Double getDoubleTest() {
        return doubleTest;
    }

    public void setDoubleTest(Double doubleTest) {
        this.doubleTest = doubleTest;
    }

    public String getCharTest() {
        return charTest;
    }

    public void setCharTest(String charTest) {
        this.charTest = charTest == null ? null : charTest.trim();
    }

    public String getVarcharTest() {
        return varcharTest;
    }

    public void setVarcharTest(String varcharTest) {
        this.varcharTest = varcharTest == null ? null : varcharTest.trim();
    }

    public BigDecimal getDecimalTest() {
        return decimalTest;
    }

    public void setDecimalTest(BigDecimal decimalTest) {
        this.decimalTest = decimalTest;
    }

    public BigDecimal getNumericTest() {
        return numericTest;
    }

    public void setNumericTest(BigDecimal numericTest) {
        this.numericTest = numericTest;
    }

    public Date getYearTest() {
        return yearTest;
    }

    public void setYearTest(Date yearTest) {
        this.yearTest = yearTest;
    }

    public Date getDateTest() {
        return dateTest;
    }

    public void setDateTest(Date dateTest) {
        this.dateTest = dateTest;
    }

    public Date getTimeTest() {
        return timeTest;
    }

    public void setTimeTest(Date timeTest) {
        this.timeTest = timeTest;
    }

    public Date getDatatimeTest() {
        return datatimeTest;
    }

    public void setDatatimeTest(Date datatimeTest) {
        this.datatimeTest = datatimeTest;
    }

    public Date getTimestampTest() {
        return timestampTest;
    }

    public void setTimestampTest(Date timestampTest) {
        this.timestampTest = timestampTest;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Long getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}