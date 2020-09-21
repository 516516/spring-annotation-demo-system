package com.personal.knowledge.system.model;

import java.math.BigDecimal;
import java.util.Date;

public class DataTypeStudy {
    private Integer id;

    private Byte tinyintT1;

    private Short smallintT2;

    private Integer mediumintT3;

    private Integer intT4;

    private Integer integerT4;

    private Long bigintT8;

    private Float floatT4;

    private Double doubleT8;

    private BigDecimal decimalTM2d2;

    private Date dateYyyyMmDd3;

    private Date timeHhMmSs3;

    private Date yearYyyy1;

    private Date datetimeYyyyMmDdHhMmSs8;

    private Date timestampYyyymmddhhmmss4;

    private String char255;

    private String varchar65535;

    private String tinytext255;

    private byte[] tinyblob255;

    private byte[] blob65535;

    private String text65535;

    private byte[] mediumblob16777215;

    private String mediumtext16777215;

    private byte[] longblob4294967295;

    private String longtext4294967295;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getTinyintT1() {
        return tinyintT1;
    }

    public void setTinyintT1(Byte tinyintT1) {
        this.tinyintT1 = tinyintT1;
    }

    public Short getSmallintT2() {
        return smallintT2;
    }

    public void setSmallintT2(Short smallintT2) {
        this.smallintT2 = smallintT2;
    }

    public Integer getMediumintT3() {
        return mediumintT3;
    }

    public void setMediumintT3(Integer mediumintT3) {
        this.mediumintT3 = mediumintT3;
    }

    public Integer getIntT4() {
        return intT4;
    }

    public void setIntT4(Integer intT4) {
        this.intT4 = intT4;
    }

    public Integer getIntegerT4() {
        return integerT4;
    }

    public void setIntegerT4(Integer integerT4) {
        this.integerT4 = integerT4;
    }

    public Long getBigintT8() {
        return bigintT8;
    }

    public void setBigintT8(Long bigintT8) {
        this.bigintT8 = bigintT8;
    }

    public Float getFloatT4() {
        return floatT4;
    }

    public void setFloatT4(Float floatT4) {
        this.floatT4 = floatT4;
    }

    public Double getDoubleT8() {
        return doubleT8;
    }

    public void setDoubleT8(Double doubleT8) {
        this.doubleT8 = doubleT8;
    }

    public BigDecimal getDecimalTM2d2() {
        return decimalTM2d2;
    }

    public void setDecimalTM2d2(BigDecimal decimalTM2d2) {
        this.decimalTM2d2 = decimalTM2d2;
    }

    public Date getDateYyyyMmDd3() {
        return dateYyyyMmDd3;
    }

    public void setDateYyyyMmDd3(Date dateYyyyMmDd3) {
        this.dateYyyyMmDd3 = dateYyyyMmDd3;
    }

    public Date getTimeHhMmSs3() {
        return timeHhMmSs3;
    }

    public void setTimeHhMmSs3(Date timeHhMmSs3) {
        this.timeHhMmSs3 = timeHhMmSs3;
    }

    public Date getYearYyyy1() {
        return yearYyyy1;
    }

    public void setYearYyyy1(Date yearYyyy1) {
        this.yearYyyy1 = yearYyyy1;
    }

    public Date getDatetimeYyyyMmDdHhMmSs8() {
        return datetimeYyyyMmDdHhMmSs8;
    }

    public void setDatetimeYyyyMmDdHhMmSs8(Date datetimeYyyyMmDdHhMmSs8) {
        this.datetimeYyyyMmDdHhMmSs8 = datetimeYyyyMmDdHhMmSs8;
    }

    public Date getTimestampYyyymmddhhmmss4() {
        return timestampYyyymmddhhmmss4;
    }

    public void setTimestampYyyymmddhhmmss4(Date timestampYyyymmddhhmmss4) {
        this.timestampYyyymmddhhmmss4 = timestampYyyymmddhhmmss4;
    }

    public String getChar255() {
        return char255;
    }

    public void setChar255(String char255) {
        this.char255 = char255 == null ? null : char255.trim();
    }

    public String getVarchar65535() {
        return varchar65535;
    }

    public void setVarchar65535(String varchar65535) {
        this.varchar65535 = varchar65535 == null ? null : varchar65535.trim();
    }

    public String getTinytext255() {
        return tinytext255;
    }

    public void setTinytext255(String tinytext255) {
        this.tinytext255 = tinytext255 == null ? null : tinytext255.trim();
    }

    public byte[] getTinyblob255() {
        return tinyblob255;
    }

    public void setTinyblob255(byte[] tinyblob255) {
        this.tinyblob255 = tinyblob255;
    }

    public byte[] getBlob65535() {
        return blob65535;
    }

    public void setBlob65535(byte[] blob65535) {
        this.blob65535 = blob65535;
    }

    public String getText65535() {
        return text65535;
    }

    public void setText65535(String text65535) {
        this.text65535 = text65535 == null ? null : text65535.trim();
    }

    public byte[] getMediumblob16777215() {
        return mediumblob16777215;
    }

    public void setMediumblob16777215(byte[] mediumblob16777215) {
        this.mediumblob16777215 = mediumblob16777215;
    }

    public String getMediumtext16777215() {
        return mediumtext16777215;
    }

    public void setMediumtext16777215(String mediumtext16777215) {
        this.mediumtext16777215 = mediumtext16777215 == null ? null : mediumtext16777215.trim();
    }

    public byte[] getLongblob4294967295() {
        return longblob4294967295;
    }

    public void setLongblob4294967295(byte[] longblob4294967295) {
        this.longblob4294967295 = longblob4294967295;
    }

    public String getLongtext4294967295() {
        return longtext4294967295;
    }

    public void setLongtext4294967295(String longtext4294967295) {
        this.longtext4294967295 = longtext4294967295 == null ? null : longtext4294967295.trim();
    }
}