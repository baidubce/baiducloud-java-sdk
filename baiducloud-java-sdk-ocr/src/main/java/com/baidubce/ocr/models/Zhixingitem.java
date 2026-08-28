package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Zhixingitem {
    /**
     * 状态
     */
    private String casestate;

    /**
     * 身份证号码/组织机构代码
     */
    private String partycardnum;

    /**
     * 官网系统ID
     */
    private String zxid;

    /**
     * 名称
     */
    private String pname;

    /**
     * 立案时间
     */
    private String casecreatetime;

    /**
     * 立案号
     */
    private String casecode;

    /**
     * 执行法院
     */
    private String execcourtname;

    /**
     * 标的
     */
    private String execmoney;

    public Zhixingitem setCasestate(String casestate) {
        this.casestate = casestate;
        return this;
    }

    public String getCasestate() {
        return this.casestate;
    }

    public Zhixingitem setPartycardnum(String partycardnum) {
        this.partycardnum = partycardnum;
        return this;
    }

    public String getPartycardnum() {
        return this.partycardnum;
    }

    public Zhixingitem setZxid(String zxid) {
        this.zxid = zxid;
        return this;
    }

    public String getZxid() {
        return this.zxid;
    }

    public Zhixingitem setPname(String pname) {
        this.pname = pname;
        return this;
    }

    public String getPname() {
        return this.pname;
    }

    public Zhixingitem setCasecreatetime(String casecreatetime) {
        this.casecreatetime = casecreatetime;
        return this;
    }

    public String getCasecreatetime() {
        return this.casecreatetime;
    }

    public Zhixingitem setCasecode(String casecode) {
        this.casecode = casecode;
        return this;
    }

    public String getCasecode() {
        return this.casecode;
    }

    public Zhixingitem setExeccourtname(String execcourtname) {
        this.execcourtname = execcourtname;
        return this;
    }

    public String getExeccourtname() {
        return this.execcourtname;
    }

    public Zhixingitem setExecmoney(String execmoney) {
        this.execmoney = execmoney;
        return this;
    }

    public String getExecmoney() {
        return this.execmoney;
    }

    @Override
    public String toString() {
        return "Zhixingitem{" + "casestate=" + casestate + "\n" + "partycardnum=" + partycardnum + "\n" + "zxid=" + zxid + "\n" + "pname=" + pname + "\n" + "casecreatetime="
                + casecreatetime + "\n" + "casecode=" + casecode + "\n" + "execcourtname=" + execcourtname + "\n" + "execmoney=" + execmoney + "\n" + "}";
    }

}