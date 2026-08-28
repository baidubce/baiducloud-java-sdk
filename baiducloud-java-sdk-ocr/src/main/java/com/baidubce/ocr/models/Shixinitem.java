package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Shixinitem {
    /**
     * 公司名称
     */
    private String iname;

    /**
     * 立案日期
     */
    private String regdate;

    /**
     * 立案文书号
     */
    private String casecode;

    /**
     * 组织机构代码
     */
    private String cardnum;

    /**
     * 执行依据文号
     */
    private String gistcid;

    /**
     * 发布时间
     */
    private String publishdate;

    /**
     * 被执行人的履约情况
     */
    private String performance;

    /**
     * 行为备注
     */
    private String disreputtypename;

    /**
     * 执行法院
     */
    private String courtname;

    public Shixinitem setIname(String iname) {
        this.iname = iname;
        return this;
    }

    public String getIname() {
        return this.iname;
    }

    public Shixinitem setRegdate(String regdate) {
        this.regdate = regdate;
        return this;
    }

    public String getRegdate() {
        return this.regdate;
    }

    public Shixinitem setCasecode(String casecode) {
        this.casecode = casecode;
        return this;
    }

    public String getCasecode() {
        return this.casecode;
    }

    public Shixinitem setCardnum(String cardnum) {
        this.cardnum = cardnum;
        return this;
    }

    public String getCardnum() {
        return this.cardnum;
    }

    public Shixinitem setGistcid(String gistcid) {
        this.gistcid = gistcid;
        return this;
    }

    public String getGistcid() {
        return this.gistcid;
    }

    public Shixinitem setPublishdate(String publishdate) {
        this.publishdate = publishdate;
        return this;
    }

    public String getPublishdate() {
        return this.publishdate;
    }

    public Shixinitem setPerformance(String performance) {
        this.performance = performance;
        return this;
    }

    public String getPerformance() {
        return this.performance;
    }

    public Shixinitem setDisreputtypename(String disreputtypename) {
        this.disreputtypename = disreputtypename;
        return this;
    }

    public String getDisreputtypename() {
        return this.disreputtypename;
    }

    public Shixinitem setCourtname(String courtname) {
        this.courtname = courtname;
        return this;
    }

    public String getCourtname() {
        return this.courtname;
    }

    @Override
    public String toString() {
        return "Shixinitem{" + "iname=" + iname + "\n" + "regdate=" + regdate + "\n" + "casecode=" + casecode + "\n" + "cardnum=" + cardnum + "\n" + "gistcid=" + gistcid + "\n"
                + "publishdate=" + publishdate + "\n" + "performance=" + performance + "\n" + "disreputtypename=" + disreputtypename + "\n" + "courtname=" + courtname + "\n"
                + "}";
    }

}