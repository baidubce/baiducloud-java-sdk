package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OpenapiErrorlog {
    /**
     * 错误日志id
     */
    private String errorlogId;

    /**
     * 错误日志大小
     */
    private Long errorlogSizeInBytes;

    /**
     * 错误日志开始时间
     */
    private String errorlogStartTime;

    /**
     * 错误日志结束时间
     */
    private String errorlogEndTime;

    public OpenapiErrorlog setErrorlogId(String errorlogId) {
        this.errorlogId = errorlogId;
        return this;
    }

    public String getErrorlogId() {
        return this.errorlogId;
    }

    public OpenapiErrorlog setErrorlogSizeInBytes(Long errorlogSizeInBytes) {
        this.errorlogSizeInBytes = errorlogSizeInBytes;
        return this;
    }

    public Long getErrorlogSizeInBytes() {
        return this.errorlogSizeInBytes;
    }

    public OpenapiErrorlog setErrorlogStartTime(String errorlogStartTime) {
        this.errorlogStartTime = errorlogStartTime;
        return this;
    }

    public String getErrorlogStartTime() {
        return this.errorlogStartTime;
    }

    public OpenapiErrorlog setErrorlogEndTime(String errorlogEndTime) {
        this.errorlogEndTime = errorlogEndTime;
        return this;
    }

    public String getErrorlogEndTime() {
        return this.errorlogEndTime;
    }

    @Override
    public String toString() {
        return "OpenapiErrorlog{" + "errorlogId=" + errorlogId + "\n" + "errorlogSizeInBytes=" + errorlogSizeInBytes + "\n" + "errorlogStartTime=" + errorlogStartTime + "\n"
                + "errorlogEndTime=" + errorlogEndTime + "\n" + "}";
    }

}