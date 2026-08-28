package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Branch {
    /**
     * 注册号
     */
    private String companycode;

    /**
     * 名称
     */
    private String companyname;

    /**
     * 登记机关
     */
    private String authority;

    /**
     * 统一社会信用代码
     */
    private String creditno;

    /**
     * 法人姓名
     */
    private String legalperson;

    public Branch setCompanycode(String companycode) {
        this.companycode = companycode;
        return this;
    }

    public String getCompanycode() {
        return this.companycode;
    }

    public Branch setCompanyname(String companyname) {
        this.companyname = companyname;
        return this;
    }

    public String getCompanyname() {
        return this.companyname;
    }

    public Branch setAuthority(String authority) {
        this.authority = authority;
        return this;
    }

    public String getAuthority() {
        return this.authority;
    }

    public Branch setCreditno(String creditno) {
        this.creditno = creditno;
        return this;
    }

    public String getCreditno() {
        return this.creditno;
    }

    public Branch setLegalperson(String legalperson) {
        this.legalperson = legalperson;
        return this;
    }

    public String getLegalperson() {
        return this.legalperson;
    }

    @Override
    public String toString() {
        return "Branch{" + "companycode=" + companycode + "\n" + "companyname=" + companyname + "\n" + "authority=" + authority + "\n" + "creditno=" + creditno + "\n"
                + "legalperson=" + legalperson + "\n" + "}";
    }

}