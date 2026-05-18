package com.baidubce.eip.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UnbanRecordModel {
    /**
     * IP地址，点分十进制表示
     */
    private String ip;

    /**
     * 防护类型，基础防护（0），TBSP增强防护（1）
     */
    private Integer protectType;

    /**
     * 封堵开始时间
     */
    private String startTime;

    /**
     * 预计解封时间
     */
    private String expectEndTime;

    /**
     * 状态，解封（0），封禁中（1）
     */
    private Integer status;

    public UnbanRecordModel setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getIp() {
        return this.ip;
    }

    public UnbanRecordModel setProtectType(Integer protectType) {
        this.protectType = protectType;
        return this;
    }

    public Integer getProtectType() {
        return this.protectType;
    }

    public UnbanRecordModel setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public UnbanRecordModel setExpectEndTime(String expectEndTime) {
        this.expectEndTime = expectEndTime;
        return this;
    }

    public String getExpectEndTime() {
        return this.expectEndTime;
    }

    public UnbanRecordModel setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Integer getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "UnbanRecordModel{" + "ip=" + ip + "\n" + "protectType=" + protectType + "\n" + "startTime=" + startTime + "\n" + "expectEndTime=" + expectEndTime + "\n"
                + "status=" + status + "\n" + "}";
    }

}