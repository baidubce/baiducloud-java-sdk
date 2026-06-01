package com.baidubce.apm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeRetentionLimitResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 状态码
    */
    private String code;

    /**
    * 错误信息
    */
    private String message;

    /**
    * Trace保存时长最小值，单位：天
    */
    private Integer minTraceRetentionDays;

    /**
    * Trace保存时长最大值，单位：天
    */
    private Integer maxTraceRetentionDays;

    /**
    * Metric保存时长最小值，单位：天
    */
    private Integer minMetricRetentionDays;

    /**
    * Metric保存时长最大值，单位：天
    */
    private Integer maxMetricRetentionDays;

    /**
    * Trace表保存时长最小值，单位：天
    */
    private Integer minDorisRetentionDays;

    /**
    * Trace表保存时长最大值，单位：天
    */
    private Integer maxDorisRetentionDays;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeRetentionLimitResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeRetentionLimitResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeRetentionLimitResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public Integer getMinTraceRetentionDays() {
        return minTraceRetentionDays;
    }

    public DescribeRetentionLimitResponse setMinTraceRetentionDays(Integer minTraceRetentionDays) {
        this.minTraceRetentionDays = minTraceRetentionDays;
        return this;
    }

    public Integer getMaxTraceRetentionDays() {
        return maxTraceRetentionDays;
    }

    public DescribeRetentionLimitResponse setMaxTraceRetentionDays(Integer maxTraceRetentionDays) {
        this.maxTraceRetentionDays = maxTraceRetentionDays;
        return this;
    }

    public Integer getMinMetricRetentionDays() {
        return minMetricRetentionDays;
    }

    public DescribeRetentionLimitResponse setMinMetricRetentionDays(Integer minMetricRetentionDays) {
        this.minMetricRetentionDays = minMetricRetentionDays;
        return this;
    }

    public Integer getMaxMetricRetentionDays() {
        return maxMetricRetentionDays;
    }

    public DescribeRetentionLimitResponse setMaxMetricRetentionDays(Integer maxMetricRetentionDays) {
        this.maxMetricRetentionDays = maxMetricRetentionDays;
        return this;
    }

    public Integer getMinDorisRetentionDays() {
        return minDorisRetentionDays;
    }

    public DescribeRetentionLimitResponse setMinDorisRetentionDays(Integer minDorisRetentionDays) {
        this.minDorisRetentionDays = minDorisRetentionDays;
        return this;
    }

    public Integer getMaxDorisRetentionDays() {
        return maxDorisRetentionDays;
    }

    public DescribeRetentionLimitResponse setMaxDorisRetentionDays(Integer maxDorisRetentionDays) {
        this.maxDorisRetentionDays = maxDorisRetentionDays;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeRetentionLimitResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "minTraceRetentionDays="
                + minTraceRetentionDays + "\n" + "maxTraceRetentionDays=" + maxTraceRetentionDays + "\n" + "minMetricRetentionDays=" + minMetricRetentionDays + "\n"
                + "maxMetricRetentionDays=" + maxMetricRetentionDays + "\n" + "minDorisRetentionDays=" + minDorisRetentionDays + "\n" + "maxDorisRetentionDays="
                + maxDorisRetentionDays + "\n" + "}";
    }

}
