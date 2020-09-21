package com.personal.knowledge.system.model;

import java.util.Date;

public class HtmlDemo {
    private Long id;

    private String htmlText;

    private Integer htmlSelect;

    private Integer htmlCheckbox;

    private Integer htmlRadio;

    private String htmlTextarea;

    private String htmlPassword;

    private Integer htmlStatus;

    private String htmlStarttime;

    private String htmlEndtime;

    private Date createTime;

    private Date updateTime;

    private Integer yn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHtmlText() {
        return htmlText;
    }

    public void setHtmlText(String htmlText) {
        this.htmlText = htmlText == null ? null : htmlText.trim();
    }

    public Integer getHtmlSelect() {
        return htmlSelect;
    }

    public void setHtmlSelect(Integer htmlSelect) {
        this.htmlSelect = htmlSelect;
    }

    public Integer getHtmlCheckbox() {
        return htmlCheckbox;
    }

    public void setHtmlCheckbox(Integer htmlCheckbox) {
        this.htmlCheckbox = htmlCheckbox;
    }

    public Integer getHtmlRadio() {
        return htmlRadio;
    }

    public void setHtmlRadio(Integer htmlRadio) {
        this.htmlRadio = htmlRadio;
    }

    public String getHtmlTextarea() {
        return htmlTextarea;
    }

    public void setHtmlTextarea(String htmlTextarea) {
        this.htmlTextarea = htmlTextarea == null ? null : htmlTextarea.trim();
    }

    public String getHtmlPassword() {
        return htmlPassword;
    }

    public void setHtmlPassword(String htmlPassword) {
        this.htmlPassword = htmlPassword == null ? null : htmlPassword.trim();
    }

    public Integer getHtmlStatus() {
        return htmlStatus;
    }

    public void setHtmlStatus(Integer htmlStatus) {
        this.htmlStatus = htmlStatus;
    }

    public String getHtmlStarttime() {
        return htmlStarttime;
    }

    public void setHtmlStarttime(String htmlStarttime) {
        this.htmlStarttime = htmlStarttime == null ? null : htmlStarttime.trim();
    }

    public String getHtmlEndtime() {
        return htmlEndtime;
    }

    public void setHtmlEndtime(String htmlEndtime) {
        this.htmlEndtime = htmlEndtime == null ? null : htmlEndtime.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }
}