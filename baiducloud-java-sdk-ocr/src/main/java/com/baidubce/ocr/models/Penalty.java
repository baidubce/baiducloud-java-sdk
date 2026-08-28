package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Penalty {
    /**
     * 行政处罚决定书文号
     */
    private String docno;

    /**
     * 违法行为类型
     */
    private String penaltytype;

    /**
     * 行政处罚决定机关名称
     */
    private String officename;

    /**
     * 行政处罚内容
     */
    private String content;

    /**
     * 作出行政处罚决定日期
     */
    private String penaltydate;

    /**
     * 作出行政公示日期
     */
    private String publicdate;

    /**
     * 备注
     */
    private String remark;

    public Penalty setDocno(String docno) {
        this.docno = docno;
        return this;
    }

    public String getDocno() {
        return this.docno;
    }

    public Penalty setPenaltytype(String penaltytype) {
        this.penaltytype = penaltytype;
        return this;
    }

    public String getPenaltytype() {
        return this.penaltytype;
    }

    public Penalty setOfficename(String officename) {
        this.officename = officename;
        return this;
    }

    public String getOfficename() {
        return this.officename;
    }

    public Penalty setContent(String content) {
        this.content = content;
        return this;
    }

    public String getContent() {
        return this.content;
    }

    public Penalty setPenaltydate(String penaltydate) {
        this.penaltydate = penaltydate;
        return this;
    }

    public String getPenaltydate() {
        return this.penaltydate;
    }

    public Penalty setPublicdate(String publicdate) {
        this.publicdate = publicdate;
        return this;
    }

    public String getPublicdate() {
        return this.publicdate;
    }

    public Penalty setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public String getRemark() {
        return this.remark;
    }

    @Override
    public String toString() {
        return "Penalty{" + "docno=" + docno + "\n" + "penaltytype=" + penaltytype + "\n" + "officename=" + officename + "\n" + "content=" + content + "\n" + "penaltydate="
                + penaltydate + "\n" + "publicdate=" + publicdate + "\n" + "remark=" + remark + "\n" + "}";
    }

}