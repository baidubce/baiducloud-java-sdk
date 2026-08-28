package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Permission {
    /**
     * 项目名称
     */
    private String name;

    /**
     * 地域
     */
    private String province;

    /**
     * 决定日期
     */
    private String liandate;

    /**
     * 决定文书号
     */
    private String caseno;

    public Permission setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Permission setProvince(String province) {
        this.province = province;
        return this;
    }

    public String getProvince() {
        return this.province;
    }

    public Permission setLiandate(String liandate) {
        this.liandate = liandate;
        return this;
    }

    public String getLiandate() {
        return this.liandate;
    }

    public Permission setCaseno(String caseno) {
        this.caseno = caseno;
        return this;
    }

    public String getCaseno() {
        return this.caseno;
    }

    @Override
    public String toString() {
        return "Permission{" + "name=" + name + "\n" + "province=" + province + "\n" + "liandate=" + liandate + "\n" + "caseno=" + caseno + "\n" + "}";
    }

}