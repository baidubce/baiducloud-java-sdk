package com.baidubce.as.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BccNameConfig {
    /**
     * 虚拟机名字（可选）。默认都不指定name。如果指定name：批量时name作为名字的前缀。后端将加上后缀
     */
    private String bccName;

    /**
     * 虚拟机主机名（可选）。默认都不指定hostname。如果指定hostname：批量时hostname作为名字的前缀。后端将加上后缀
     */
    private String bccHostname;

    /**
     * 是否自动生成name和hostname有序后缀（可选参数） 是:true 否:false
     */
    private Boolean autoSeqSuffix;

    /**
     * 是否自动生成hostname domain（可选参数） 是:true 否:false
     */
    private Boolean openHostnameDomain;

    public BccNameConfig setBccName(String bccName) {
        this.bccName = bccName;
        return this;
    }

    public String getBccName() {
        return this.bccName;
    }

    public BccNameConfig setBccHostname(String bccHostname) {
        this.bccHostname = bccHostname;
        return this;
    }

    public String getBccHostname() {
        return this.bccHostname;
    }

    public BccNameConfig setAutoSeqSuffix(Boolean autoSeqSuffix) {
        this.autoSeqSuffix = autoSeqSuffix;
        return this;
    }

    public Boolean getAutoSeqSuffix() {
        return this.autoSeqSuffix;
    }

    public BccNameConfig setOpenHostnameDomain(Boolean openHostnameDomain) {
        this.openHostnameDomain = openHostnameDomain;
        return this;
    }

    public Boolean getOpenHostnameDomain() {
        return this.openHostnameDomain;
    }

    @Override
    public String toString() {
        return "BccNameConfig{" + "bccName=" + bccName + "\n" + "bccHostname=" + bccHostname + "\n" + "autoSeqSuffix=" + autoSeqSuffix + "\n" + "openHostnameDomain="
                + openHostnameDomain + "\n" + "}";
    }

}