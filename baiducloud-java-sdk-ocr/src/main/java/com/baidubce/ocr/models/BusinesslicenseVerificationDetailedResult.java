package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusinesslicenseVerificationDetailedResult {
    /**
     * base
     */
    private Base base;

    /**
     * 分支机构，每个数组可能包含多个object
     */
    private List<Branch> branches;

    /**
     * 企业变更
     */
    private List<Change> changes;

    /**
     * 纳税信息
     */
    private List<Taxcredititem> taxcredititems;

    /**
     * contactinfo
     */
    private Contactinfo contactinfo;

    /**
     * 企业高管，每个数组可能包含多个object
     */
    private List<Employee> employees;

    /**
     * 经营异常
     */
    private List<ExceptionInfo> exceptions;

    /**
     * 行业信息
     */
    private List<Industry> industry;

    /**
     * liquidation
     */
    private Liquidation liquidation;

    /**
     * 动产抵押，每个数组可能包含多个object
     */
    private List<Mpledge> mpledges;

    /**
     * 曾用名，每个数组可能包含多个object
     */
    private List<Originalname> originalname;

    /**
     * 股东信息，每个数组可能包含多个object
     */
    private List<Partner> partners;

    /**
     * 行政处罚，每个数组可能包含多个object
     */
    private List<Penalty> penalties;

    /**
     * 行政许可，每个数组可能包含多个object
     */
    private List<Permission> permissions;

    /**
     * 股权出质，每个数组可能包含多个object
     */
    private List<Pledge> pledges;

    /**
     * 企业抽查检查，每个数组可能包含多个object
     */
    private List<Spotcheck> spotchecks;

    /**
     * 失信，每个数组可能包含多个object
     */
    private List<Shixinitem> shixinitems;

    /**
     * 被执行，每个数组可能包含多个object
     */
    private List<Zhixingitem> zhixingitems;

    public BusinesslicenseVerificationDetailedResult setBase(Base base) {
        this.base = base;
        return this;
    }

    public Base getBase() {
        return this.base;
    }

    public BusinesslicenseVerificationDetailedResult setBranches(List<Branch> branches) {
        this.branches = branches;
        return this;
    }

    public List<Branch> getBranches() {
        return this.branches;
    }

    public BusinesslicenseVerificationDetailedResult setChanges(List<Change> changes) {
        this.changes = changes;
        return this;
    }

    public List<Change> getChanges() {
        return this.changes;
    }

    public BusinesslicenseVerificationDetailedResult setTaxcredititems(List<Taxcredititem> taxcredititems) {
        this.taxcredititems = taxcredititems;
        return this;
    }

    public List<Taxcredititem> getTaxcredititems() {
        return this.taxcredititems;
    }

    public BusinesslicenseVerificationDetailedResult setContactinfo(Contactinfo contactinfo) {
        this.contactinfo = contactinfo;
        return this;
    }

    public Contactinfo getContactinfo() {
        return this.contactinfo;
    }

    public BusinesslicenseVerificationDetailedResult setEmployees(List<Employee> employees) {
        this.employees = employees;
        return this;
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }

    public BusinesslicenseVerificationDetailedResult setExceptions(List<ExceptionInfo> exceptions) {
        this.exceptions = exceptions;
        return this;
    }

    public List<ExceptionInfo> getExceptions() {
        return this.exceptions;
    }

    public BusinesslicenseVerificationDetailedResult setIndustry(List<Industry> industry) {
        this.industry = industry;
        return this;
    }

    public List<Industry> getIndustry() {
        return this.industry;
    }

    public BusinesslicenseVerificationDetailedResult setLiquidation(Liquidation liquidation) {
        this.liquidation = liquidation;
        return this;
    }

    public Liquidation getLiquidation() {
        return this.liquidation;
    }

    public BusinesslicenseVerificationDetailedResult setMpledges(List<Mpledge> mpledges) {
        this.mpledges = mpledges;
        return this;
    }

    public List<Mpledge> getMpledges() {
        return this.mpledges;
    }

    public BusinesslicenseVerificationDetailedResult setOriginalname(List<Originalname> originalname) {
        this.originalname = originalname;
        return this;
    }

    public List<Originalname> getOriginalname() {
        return this.originalname;
    }

    public BusinesslicenseVerificationDetailedResult setPartners(List<Partner> partners) {
        this.partners = partners;
        return this;
    }

    public List<Partner> getPartners() {
        return this.partners;
    }

    public BusinesslicenseVerificationDetailedResult setPenalties(List<Penalty> penalties) {
        this.penalties = penalties;
        return this;
    }

    public List<Penalty> getPenalties() {
        return this.penalties;
    }

    public BusinesslicenseVerificationDetailedResult setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
        return this;
    }

    public List<Permission> getPermissions() {
        return this.permissions;
    }

    public BusinesslicenseVerificationDetailedResult setPledges(List<Pledge> pledges) {
        this.pledges = pledges;
        return this;
    }

    public List<Pledge> getPledges() {
        return this.pledges;
    }

    public BusinesslicenseVerificationDetailedResult setSpotchecks(List<Spotcheck> spotchecks) {
        this.spotchecks = spotchecks;
        return this;
    }

    public List<Spotcheck> getSpotchecks() {
        return this.spotchecks;
    }

    public BusinesslicenseVerificationDetailedResult setShixinitems(List<Shixinitem> shixinitems) {
        this.shixinitems = shixinitems;
        return this;
    }

    public List<Shixinitem> getShixinitems() {
        return this.shixinitems;
    }

    public BusinesslicenseVerificationDetailedResult setZhixingitems(List<Zhixingitem> zhixingitems) {
        this.zhixingitems = zhixingitems;
        return this;
    }

    public List<Zhixingitem> getZhixingitems() {
        return this.zhixingitems;
    }

    @Override
    public String toString() {
        return "BusinesslicenseVerificationDetailedResult{" + "base=" + base + "\n" + "branches=" + branches + "\n" + "changes=" + changes + "\n" + "taxcredititems="
                + taxcredititems + "\n" + "contactinfo=" + contactinfo + "\n" + "employees=" + employees + "\n" + "exceptions=" + exceptions + "\n" + "industry=" + industry + "\n"
                + "liquidation=" + liquidation + "\n" + "mpledges=" + mpledges + "\n" + "originalname=" + originalname + "\n" + "partners=" + partners + "\n" + "penalties="
                + penalties + "\n" + "permissions=" + permissions + "\n" + "pledges=" + pledges + "\n" + "spotchecks=" + spotchecks + "\n" + "shixinitems=" + shixinitems + "\n"
                + "zhixingitems=" + zhixingitems + "\n" + "}";
    }

}