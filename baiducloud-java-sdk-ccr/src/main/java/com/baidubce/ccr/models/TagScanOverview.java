package com.baidubce.ccr.models;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TagScanOverview {
    /**
     * 漏洞扫描完成时间，格式为 `date-time`
     */
    private String endTime;

    /**
     * 可修复漏洞数量
     */
    private Integer fixable;

    /**
     * 本机扫描报告的 ID
     */
    private String reportId;

    /**
     * 报告生成状态
     */
    private String scanStatus;

    /**
     * 漏洞等级：`Critical` 危及、`High` 严重、`Medium` 中等、`Low` 较低
     */
    private String severity;

    /**
     * 漏洞扫描开始时间，格式为 `date-time`
     */
    private String startTime;

    /**
     * 不同严重程度的漏洞数量
     */
    private Map<String, Integer> summary;

    /**
     * 发现的漏洞总数
     */
    private Integer total;

    public TagScanOverview setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public TagScanOverview setFixable(Integer fixable) {
        this.fixable = fixable;
        return this;
    }

    public Integer getFixable() {
        return this.fixable;
    }

    public TagScanOverview setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }

    public String getReportId() {
        return this.reportId;
    }

    public TagScanOverview setScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
        return this;
    }

    public String getScanStatus() {
        return this.scanStatus;
    }

    public TagScanOverview setSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    public String getSeverity() {
        return this.severity;
    }

    public TagScanOverview setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public TagScanOverview setSummary(Map<String, Integer> summary) {
        this.summary = summary;
        return this;
    }

    public Map<String, Integer> getSummary() {
        return this.summary;
    }

    public TagScanOverview setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getTotal() {
        return this.total;
    }

    @Override
    public String toString() {
        return "TagScanOverview{" + "endTime=" + endTime + "\n" + "fixable=" + fixable + "\n" + "reportId=" + reportId + "\n" + "scanStatus=" + scanStatus + "\n" + "severity="
                + severity + "\n" + "startTime=" + startTime + "\n" + "summary=" + summary + "\n" + "total=" + total + "\n" + "}";
    }

}