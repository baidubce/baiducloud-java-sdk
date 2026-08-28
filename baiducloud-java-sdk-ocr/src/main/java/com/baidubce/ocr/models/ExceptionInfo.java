package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExceptionInfo {
    /**
     * 列入经营异常名录原因
     */
    private String addreason;

    /**
     * 列入日期
     */
    private String adddate;

    /**
     * 移出经营异常名录原因
     */
    private String removereason;

    /**
     * 移出日期
     */
    private String removedate;

    /**
     * 作出决定机关
     */
    private String decisionoffice;

    /**
     * 移除决定机关
     */
    private String removedecisionoffice;

    public ExceptionInfo setAddreason(String addreason) {
        this.addreason = addreason;
        return this;
    }

    public String getAddreason() {
        return this.addreason;
    }

    public ExceptionInfo setAdddate(String adddate) {
        this.adddate = adddate;
        return this;
    }

    public String getAdddate() {
        return this.adddate;
    }

    public ExceptionInfo setRemovereason(String removereason) {
        this.removereason = removereason;
        return this;
    }

    public String getRemovereason() {
        return this.removereason;
    }

    public ExceptionInfo setRemovedate(String removedate) {
        this.removedate = removedate;
        return this;
    }

    public String getRemovedate() {
        return this.removedate;
    }

    public ExceptionInfo setDecisionoffice(String decisionoffice) {
        this.decisionoffice = decisionoffice;
        return this;
    }

    public String getDecisionoffice() {
        return this.decisionoffice;
    }

    public ExceptionInfo setRemovedecisionoffice(String removedecisionoffice) {
        this.removedecisionoffice = removedecisionoffice;
        return this;
    }

    public String getRemovedecisionoffice() {
        return this.removedecisionoffice;
    }

    @Override
    public String toString() {
        return "ExceptionInfo{" + "addreason=" + addreason + "\n" + "adddate=" + adddate + "\n" + "removereason=" + removereason + "\n" + "removedate=" + removedate + "\n"
                + "decisionoffice=" + decisionoffice + "\n" + "removedecisionoffice=" + removedecisionoffice + "\n" + "}";
    }

}