package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Pledge {
    /**
     * 质权登记编号
     */
    private String registno;

    /**
     * 出质人
     */
    private String pledgor;

    /**
     * 出质人证照编号
     */
    private String pledgorno;

    /**
     * 质权人
     */
    private String pledgee;

    /**
     * 质权人证照编号
     */
    private String pledgeeno;

    /**
     * 出质股权数额
     */
    private String pledgedamount;

    /**
     * 股权出质设立登记日期
     */
    private String regdate;

    /**
     * 公示时间
     */
    private String publicdate;

    /**
     * 出质状态
     */
    private String status;

    public Pledge setRegistno(String registno) {
        this.registno = registno;
        return this;
    }

    public String getRegistno() {
        return this.registno;
    }

    public Pledge setPledgor(String pledgor) {
        this.pledgor = pledgor;
        return this;
    }

    public String getPledgor() {
        return this.pledgor;
    }

    public Pledge setPledgorno(String pledgorno) {
        this.pledgorno = pledgorno;
        return this;
    }

    public String getPledgorno() {
        return this.pledgorno;
    }

    public Pledge setPledgee(String pledgee) {
        this.pledgee = pledgee;
        return this;
    }

    public String getPledgee() {
        return this.pledgee;
    }

    public Pledge setPledgeeno(String pledgeeno) {
        this.pledgeeno = pledgeeno;
        return this;
    }

    public String getPledgeeno() {
        return this.pledgeeno;
    }

    public Pledge setPledgedamount(String pledgedamount) {
        this.pledgedamount = pledgedamount;
        return this;
    }

    public String getPledgedamount() {
        return this.pledgedamount;
    }

    public Pledge setRegdate(String regdate) {
        this.regdate = regdate;
        return this;
    }

    public String getRegdate() {
        return this.regdate;
    }

    public Pledge setPublicdate(String publicdate) {
        this.publicdate = publicdate;
        return this;
    }

    public String getPublicdate() {
        return this.publicdate;
    }

    public Pledge setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "Pledge{" + "registno=" + registno + "\n" + "pledgor=" + pledgor + "\n" + "pledgorno=" + pledgorno + "\n" + "pledgee=" + pledgee + "\n" + "pledgeeno=" + pledgeeno
                + "\n" + "pledgedamount=" + pledgedamount + "\n" + "regdate=" + regdate + "\n" + "publicdate=" + publicdate + "\n" + "status=" + status + "\n" + "}";
    }

}