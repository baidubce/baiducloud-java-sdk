package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Mpledge {
    /**
     * 登记编号
     */
    private String registerno;

    /**
     * 登记时间
     */
    private String registerdate;

    /**
     * 公示时间
     */
    private String publicdate;

    /**
     * 登记机关
     */
    private String registeroffice;

    /**
     * 被担保债权数额
     */
    private String debtsecuredamount;

    /**
     * 状态
     */
    private String status;

    public Mpledge setRegisterno(String registerno) {
        this.registerno = registerno;
        return this;
    }

    public String getRegisterno() {
        return this.registerno;
    }

    public Mpledge setRegisterdate(String registerdate) {
        this.registerdate = registerdate;
        return this;
    }

    public String getRegisterdate() {
        return this.registerdate;
    }

    public Mpledge setPublicdate(String publicdate) {
        this.publicdate = publicdate;
        return this;
    }

    public String getPublicdate() {
        return this.publicdate;
    }

    public Mpledge setRegisteroffice(String registeroffice) {
        this.registeroffice = registeroffice;
        return this;
    }

    public String getRegisteroffice() {
        return this.registeroffice;
    }

    public Mpledge setDebtsecuredamount(String debtsecuredamount) {
        this.debtsecuredamount = debtsecuredamount;
        return this;
    }

    public String getDebtsecuredamount() {
        return this.debtsecuredamount;
    }

    public Mpledge setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "Mpledge{" + "registerno=" + registerno + "\n" + "registerdate=" + registerdate + "\n" + "publicdate=" + publicdate + "\n" + "registeroffice=" + registeroffice
                + "\n" + "debtsecuredamount=" + debtsecuredamount + "\n" + "status=" + status + "\n" + "}";
    }

}