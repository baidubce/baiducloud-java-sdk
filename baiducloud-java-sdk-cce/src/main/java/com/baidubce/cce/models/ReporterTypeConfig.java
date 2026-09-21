package com.baidubce.cce.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReporterTypeConfig {
    /**
     * 报告发送类型，可选 [ dingTalk（钉钉）, lark（飞书）, infoflow（如流）, weCom（企业微信） ]
     */
    private String reporterType;

    /**
     * 报告发送类型名称
     */
    private String reportTypeName;

    /**
     * webhook 地址前缀，配置接收方式时需拼接对应的 access_token 或 key
     */
    private String urlPrefix;

    public ReporterTypeConfig setReporterType(String reporterType) {
        this.reporterType = reporterType;
        return this;
    }

    public String getReporterType() {
        return this.reporterType;
    }

    public ReporterTypeConfig setReportTypeName(String reportTypeName) {
        this.reportTypeName = reportTypeName;
        return this;
    }

    public String getReportTypeName() {
        return this.reportTypeName;
    }

    public ReporterTypeConfig setUrlPrefix(String urlPrefix) {
        this.urlPrefix = urlPrefix;
        return this;
    }

    public String getUrlPrefix() {
        return this.urlPrefix;
    }

    @Override
    public String toString() {
        return "ReporterTypeConfig{" + "reporterType=" + reporterType + "\n" + "reportTypeName=" + reportTypeName + "\n" + "urlPrefix=" + urlPrefix + "\n" + "}";
    }

}