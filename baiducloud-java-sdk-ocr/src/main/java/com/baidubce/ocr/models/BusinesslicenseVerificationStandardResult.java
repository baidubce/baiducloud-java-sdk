package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusinesslicenseVerificationStandardResult {
    /**
     * 企业名称
     */
    private String companyname;

    /**
     * 企业类型
     */
    private String companytype;

    /**
     * 法定代表人
     */
    private String legalperson;

    /**
     * 注册资本
     */
    private String capital;

    /**
     * 注册码
     */
    private String companycode;

    /**
     * 企业地址
     */
    private String companyaddress;

    /**
     * 经营范围
     */
    private String businessscope;

    /**
     * 登记机关
     */
    private String authority;

    /**
     * 登记状态
     */
    private String companystatus;

    /**
     * 成立时间
     */
    private String establishdate;

    /**
     * 统一社会信用代码
     */
    private String creditno;

    /**
     * 营业日期
     */
    private String operationstartdate;

    /**
     * 截止日期
     */
    private String operationenddate;

    /**
     * 核准时间
     */
    private String issuedate;

    /**
     * 所在省份
     */
    private String province;

    /**
     * 所在省份-行政区号
     */
    private String provincecode;

    /**
     * 所在市
     */
    private String city;

    /**
     * 所在市-行政区号
     */
    private String citycode;

    /**
     * 所在地区
     */
    private String district;

    /**
     * 所在地区-行政区号
     */
    private String districtcode;

    /**
     * 注册资本币种
     */
    private String regcapcur;

    /**
     * 组织机构代码
     */
    private String orgcode;

    /**
     * 许可经营范围
     */
    private String licensedbusinessscope;

    /**
     * 企业英文名称
     */
    private String companyenglishname;

    /**
     * 企业曾用名
     */
    private List<String> onceusedname;

    /**
     * 原注册号
     */
    private String orgcompanycode;

    /**
     * 实收资本
     */
    private String paidincapital;

    /**
     * 吊销日期
     */
    private String revokedate;

    /**
     * 注销日期
     */
    private String logoffdate;

    public BusinesslicenseVerificationStandardResult setCompanyname(String companyname) {
        this.companyname = companyname;
        return this;
    }

    public String getCompanyname() {
        return this.companyname;
    }

    public BusinesslicenseVerificationStandardResult setCompanytype(String companytype) {
        this.companytype = companytype;
        return this;
    }

    public String getCompanytype() {
        return this.companytype;
    }

    public BusinesslicenseVerificationStandardResult setLegalperson(String legalperson) {
        this.legalperson = legalperson;
        return this;
    }

    public String getLegalperson() {
        return this.legalperson;
    }

    public BusinesslicenseVerificationStandardResult setCapital(String capital) {
        this.capital = capital;
        return this;
    }

    public String getCapital() {
        return this.capital;
    }

    public BusinesslicenseVerificationStandardResult setCompanycode(String companycode) {
        this.companycode = companycode;
        return this;
    }

    public String getCompanycode() {
        return this.companycode;
    }

    public BusinesslicenseVerificationStandardResult setCompanyaddress(String companyaddress) {
        this.companyaddress = companyaddress;
        return this;
    }

    public String getCompanyaddress() {
        return this.companyaddress;
    }

    public BusinesslicenseVerificationStandardResult setBusinessscope(String businessscope) {
        this.businessscope = businessscope;
        return this;
    }

    public String getBusinessscope() {
        return this.businessscope;
    }

    public BusinesslicenseVerificationStandardResult setAuthority(String authority) {
        this.authority = authority;
        return this;
    }

    public String getAuthority() {
        return this.authority;
    }

    public BusinesslicenseVerificationStandardResult setCompanystatus(String companystatus) {
        this.companystatus = companystatus;
        return this;
    }

    public String getCompanystatus() {
        return this.companystatus;
    }

    public BusinesslicenseVerificationStandardResult setEstablishdate(String establishdate) {
        this.establishdate = establishdate;
        return this;
    }

    public String getEstablishdate() {
        return this.establishdate;
    }

    public BusinesslicenseVerificationStandardResult setCreditno(String creditno) {
        this.creditno = creditno;
        return this;
    }

    public String getCreditno() {
        return this.creditno;
    }

    public BusinesslicenseVerificationStandardResult setOperationstartdate(String operationstartdate) {
        this.operationstartdate = operationstartdate;
        return this;
    }

    public String getOperationstartdate() {
        return this.operationstartdate;
    }

    public BusinesslicenseVerificationStandardResult setOperationenddate(String operationenddate) {
        this.operationenddate = operationenddate;
        return this;
    }

    public String getOperationenddate() {
        return this.operationenddate;
    }

    public BusinesslicenseVerificationStandardResult setIssuedate(String issuedate) {
        this.issuedate = issuedate;
        return this;
    }

    public String getIssuedate() {
        return this.issuedate;
    }

    public BusinesslicenseVerificationStandardResult setProvince(String province) {
        this.province = province;
        return this;
    }

    public String getProvince() {
        return this.province;
    }

    public BusinesslicenseVerificationStandardResult setProvincecode(String provincecode) {
        this.provincecode = provincecode;
        return this;
    }

    public String getProvincecode() {
        return this.provincecode;
    }

    public BusinesslicenseVerificationStandardResult setCity(String city) {
        this.city = city;
        return this;
    }

    public String getCity() {
        return this.city;
    }

    public BusinesslicenseVerificationStandardResult setCitycode(String citycode) {
        this.citycode = citycode;
        return this;
    }

    public String getCitycode() {
        return this.citycode;
    }

    public BusinesslicenseVerificationStandardResult setDistrict(String district) {
        this.district = district;
        return this;
    }

    public String getDistrict() {
        return this.district;
    }

    public BusinesslicenseVerificationStandardResult setDistrictcode(String districtcode) {
        this.districtcode = districtcode;
        return this;
    }

    public String getDistrictcode() {
        return this.districtcode;
    }

    public BusinesslicenseVerificationStandardResult setRegcapcur(String regcapcur) {
        this.regcapcur = regcapcur;
        return this;
    }

    public String getRegcapcur() {
        return this.regcapcur;
    }

    public BusinesslicenseVerificationStandardResult setOrgcode(String orgcode) {
        this.orgcode = orgcode;
        return this;
    }

    public String getOrgcode() {
        return this.orgcode;
    }

    public BusinesslicenseVerificationStandardResult setLicensedbusinessscope(String licensedbusinessscope) {
        this.licensedbusinessscope = licensedbusinessscope;
        return this;
    }

    public String getLicensedbusinessscope() {
        return this.licensedbusinessscope;
    }

    public BusinesslicenseVerificationStandardResult setCompanyenglishname(String companyenglishname) {
        this.companyenglishname = companyenglishname;
        return this;
    }

    public String getCompanyenglishname() {
        return this.companyenglishname;
    }

    public BusinesslicenseVerificationStandardResult setOnceusedname(List<String> onceusedname) {
        this.onceusedname = onceusedname;
        return this;
    }

    public List<String> getOnceusedname() {
        return this.onceusedname;
    }

    public BusinesslicenseVerificationStandardResult setOrgcompanycode(String orgcompanycode) {
        this.orgcompanycode = orgcompanycode;
        return this;
    }

    public String getOrgcompanycode() {
        return this.orgcompanycode;
    }

    public BusinesslicenseVerificationStandardResult setPaidincapital(String paidincapital) {
        this.paidincapital = paidincapital;
        return this;
    }

    public String getPaidincapital() {
        return this.paidincapital;
    }

    public BusinesslicenseVerificationStandardResult setRevokedate(String revokedate) {
        this.revokedate = revokedate;
        return this;
    }

    public String getRevokedate() {
        return this.revokedate;
    }

    public BusinesslicenseVerificationStandardResult setLogoffdate(String logoffdate) {
        this.logoffdate = logoffdate;
        return this;
    }

    public String getLogoffdate() {
        return this.logoffdate;
    }

    @Override
    public String toString() {
        return "BusinesslicenseVerificationStandardResult{" + "companyname=" + companyname + "\n" + "companytype=" + companytype + "\n" + "legalperson=" + legalperson + "\n"
                + "capital=" + capital + "\n" + "companycode=" + companycode + "\n" + "companyaddress=" + companyaddress + "\n" + "businessscope=" + businessscope + "\n"
                + "authority=" + authority + "\n" + "companystatus=" + companystatus + "\n" + "establishdate=" + establishdate + "\n" + "creditno=" + creditno + "\n"
                + "operationstartdate=" + operationstartdate + "\n" + "operationenddate=" + operationenddate + "\n" + "issuedate=" + issuedate + "\n" + "province=" + province
                + "\n" + "provincecode=" + provincecode + "\n" + "city=" + city + "\n" + "citycode=" + citycode + "\n" + "district=" + district + "\n" + "districtcode="
                + districtcode + "\n" + "regcapcur=" + regcapcur + "\n" + "orgcode=" + orgcode + "\n" + "licensedbusinessscope=" + licensedbusinessscope + "\n"
                + "companyenglishname=" + companyenglishname + "\n" + "onceusedname=" + onceusedname + "\n" + "orgcompanycode=" + orgcompanycode + "\n" + "paidincapital="
                + paidincapital + "\n" + "revokedate=" + revokedate + "\n" + "logoffdate=" + logoffdate + "\n" + "}";
    }

}