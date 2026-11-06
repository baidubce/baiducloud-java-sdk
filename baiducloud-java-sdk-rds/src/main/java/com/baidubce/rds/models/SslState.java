package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SslState {
    /**
     * 实例 ID
     */
    private String instanceId;

    /**
     * ssl状态, open: 开启，close: 关闭， 默认为close
     */
    private String sslStatus;

    /**
     * 加密ssl地址 如:"www.baidu.com"
     */
    private String sslAddress;

    /**
     * 开始日期
     */
    private String startTime;

    /**
     * 结束日期
     */
    private String endTime;

    public SslState setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public SslState setSslStatus(String sslStatus) {
        this.sslStatus = sslStatus;
        return this;
    }

    public String getSslStatus() {
        return this.sslStatus;
    }

    public SslState setSslAddress(String sslAddress) {
        this.sslAddress = sslAddress;
        return this;
    }

    public String getSslAddress() {
        return this.sslAddress;
    }

    public SslState setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public SslState setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getEndTime() {
        return this.endTime;
    }

    @Override
    public String toString() {
        return "SslState{" + "instanceId=" + instanceId + "\n" + "sslStatus=" + sslStatus + "\n" + "sslAddress=" + sslAddress + "\n" + "startTime=" + startTime + "\n" + "endTime="
                + endTime + "\n" + "}";
    }

}