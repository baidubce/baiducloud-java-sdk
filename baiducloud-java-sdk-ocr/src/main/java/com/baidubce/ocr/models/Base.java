package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Base {
    /**
     * 法人名
     */
    private String legalperson;

    /**
     * 成立日期
     */
    private String establishdate;

    /**
     * 吊销日期
     */
    private String revokedate;

    /**
     * 企业状态
     */
    private String companystatus;

    /**
     * 省份
     */
    private String province;

    /**
     * 统一社会信用代码
     */
    private String creditno;

    /**
     * 注册资本
     */
    private String capital;

    /**
     * 企业类型
     */
    private String companytype;

    /**
     * 地址
     */
    private String companyaddress;

    /**
     * 经营范围
     */
    private String businessscope;

    /**
     * 营业开始日期
     */
    private String businessdatefrom;

    /**
     * 营业结束日期
     */
    private String businessdateto;

    /**
     * 发照日期
     */
    private String issuedate;

    /**
     * 组织机构代码
     */
    private String orgcode;

    /**
     * 是否上市 (0为未上市，1为上市）
     */
    private String isonstock;

    /**
     * 上市公司代码
     */
    private String stocknumber;

    /**
     * 上市类型
     */
    private String stocktype;

    /**
     * 内部keyno
     */
    private String keyno;

    /**
     * 企业名称
     */
    private String companyname;

    /**
     * 注册号
     */
    private String companycode;

    /**
     * 登记机关
     */
    private String authority;

    /**
     * 注册资本币种
     */
    private String regcapcur;

    public Base setLegalperson(String legalperson) {
        this.legalperson = legalperson;
        return this;
    }

    public String getLegalperson() {
        return this.legalperson;
    }

    public Base setEstablishdate(String establishdate) {
        this.establishdate = establishdate;
        return this;
    }

    public String getEstablishdate() {
        return this.establishdate;
    }

    public Base setRevokedate(String revokedate) {
        this.revokedate = revokedate;
        return this;
    }

    public String getRevokedate() {
        return this.revokedate;
    }

    public Base setCompanystatus(String companystatus) {
        this.companystatus = companystatus;
        return this;
    }

    public String getCompanystatus() {
        return this.companystatus;
    }

    public Base setProvince(String province) {
        this.province = province;
        return this;
    }

    public String getProvince() {
        return this.province;
    }

    public Base setCreditno(String creditno) {
        this.creditno = creditno;
        return this;
    }

    public String getCreditno() {
        return this.creditno;
    }

    public Base setCapital(String capital) {
        this.capital = capital;
        return this;
    }

    public String getCapital() {
        return this.capital;
    }

    public Base setCompanytype(String companytype) {
        this.companytype = companytype;
        return this;
    }

    public String getCompanytype() {
        return this.companytype;
    }

    public Base setCompanyaddress(String companyaddress) {
        this.companyaddress = companyaddress;
        return this;
    }

    public String getCompanyaddress() {
        return this.companyaddress;
    }

    public Base setBusinessscope(String businessscope) {
        this.businessscope = businessscope;
        return this;
    }

    public String getBusinessscope() {
        return this.businessscope;
    }

    public Base setBusinessdatefrom(String businessdatefrom) {
        this.businessdatefrom = businessdatefrom;
        return this;
    }

    public String getBusinessdatefrom() {
        return this.businessdatefrom;
    }

    public Base setBusinessdateto(String businessdateto) {
        this.businessdateto = businessdateto;
        return this;
    }

    public String getBusinessdateto() {
        return this.businessdateto;
    }

    public Base setIssuedate(String issuedate) {
        this.issuedate = issuedate;
        return this;
    }

    public String getIssuedate() {
        return this.issuedate;
    }

    public Base setOrgcode(String orgcode) {
        this.orgcode = orgcode;
        return this;
    }

    public String getOrgcode() {
        return this.orgcode;
    }

    public Base setIsonstock(String isonstock) {
        this.isonstock = isonstock;
        return this;
    }

    public String getIsonstock() {
        return this.isonstock;
    }

    public Base setStocknumber(String stocknumber) {
        this.stocknumber = stocknumber;
        return this;
    }

    public String getStocknumber() {
        return this.stocknumber;
    }

    public Base setStocktype(String stocktype) {
        this.stocktype = stocktype;
        return this;
    }

    public String getStocktype() {
        return this.stocktype;
    }

    public Base setKeyno(String keyno) {
        this.keyno = keyno;
        return this;
    }

    public String getKeyno() {
        return this.keyno;
    }

    public Base setCompanyname(String companyname) {
        this.companyname = companyname;
        return this;
    }

    public String getCompanyname() {
        return this.companyname;
    }

    public Base setCompanycode(String companycode) {
        this.companycode = companycode;
        return this;
    }

    public String getCompanycode() {
        return this.companycode;
    }

    public Base setAuthority(String authority) {
        this.authority = authority;
        return this;
    }

    public String getAuthority() {
        return this.authority;
    }

    public Base setRegcapcur(String regcapcur) {
        this.regcapcur = regcapcur;
        return this;
    }

    public String getRegcapcur() {
        return this.regcapcur;
    }

    @Override
    public String toString() {
        return "Base{" + "legalperson=" + legalperson + "\n" + "establishdate=" + establishdate + "\n" + "revokedate=" + revokedate + "\n" + "companystatus=" + companystatus
                + "\n" + "province=" + province + "\n" + "creditno=" + creditno + "\n" + "capital=" + capital + "\n" + "companytype=" + companytype + "\n" + "companyaddress="
                + companyaddress + "\n" + "businessscope=" + businessscope + "\n" + "businessdatefrom=" + businessdatefrom + "\n" + "businessdateto=" + businessdateto + "\n"
                + "issuedate=" + issuedate + "\n" + "orgcode=" + orgcode + "\n" + "isonstock=" + isonstock + "\n" + "stocknumber=" + stocknumber + "\n" + "stocktype=" + stocktype
                + "\n" + "keyno=" + keyno + "\n" + "companyname=" + companyname + "\n" + "companycode=" + companycode + "\n" + "authority=" + authority + "\n" + "regcapcur="
                + regcapcur + "\n" + "}";
    }

}