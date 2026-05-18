package com.baidubce.eip.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DdosModel {
    /**
     * 公网IP
     */
    private String ip;

    /**
     * 基础防护状，包含normal正常、flush清洗中、blackhole封禁中
     */
    private String status;

    /**
     * 公网IP绑定实例类型，若处于未绑定状态，此项值为空
     */
    private String bindInstanceType;

    /**
     * 公网IP绑定实例ID，若处于未绑定状态，此项值为空
     */
    private String bindInstanceId;

    /**
     * 清洗阈值每秒流量带宽Mbps
     */
    private Long ipCleanMbps;

    /**
     * 清洗阈值每秒报文数pps
     */
    private Long ipCleanPps;

    /**
     * 清洗阈值类型，包含按带宽上限 (bandwidth)、智能阈值 (auto) 和手动设置 (manual)
     */
    private String thresholdType;

    /**
     * 最大防护阈值MB
     */
    private Long maximumThreshold;

    public DdosModel setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getIp() {
        return this.ip;
    }

    public DdosModel setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public DdosModel setBindInstanceType(String bindInstanceType) {
        this.bindInstanceType = bindInstanceType;
        return this;
    }

    public String getBindInstanceType() {
        return this.bindInstanceType;
    }

    public DdosModel setBindInstanceId(String bindInstanceId) {
        this.bindInstanceId = bindInstanceId;
        return this;
    }

    public String getBindInstanceId() {
        return this.bindInstanceId;
    }

    public DdosModel setIpCleanMbps(Long ipCleanMbps) {
        this.ipCleanMbps = ipCleanMbps;
        return this;
    }

    public Long getIpCleanMbps() {
        return this.ipCleanMbps;
    }

    public DdosModel setIpCleanPps(Long ipCleanPps) {
        this.ipCleanPps = ipCleanPps;
        return this;
    }

    public Long getIpCleanPps() {
        return this.ipCleanPps;
    }

    public DdosModel setThresholdType(String thresholdType) {
        this.thresholdType = thresholdType;
        return this;
    }

    public String getThresholdType() {
        return this.thresholdType;
    }

    public DdosModel setMaximumThreshold(Long maximumThreshold) {
        this.maximumThreshold = maximumThreshold;
        return this;
    }

    public Long getMaximumThreshold() {
        return this.maximumThreshold;
    }

    @Override
    public String toString() {
        return "DdosModel{" + "ip=" + ip + "\n" + "status=" + status + "\n" + "bindInstanceType=" + bindInstanceType + "\n" + "bindInstanceId=" + bindInstanceId + "\n"
                + "ipCleanMbps=" + ipCleanMbps + "\n" + "ipCleanPps=" + ipCleanPps + "\n" + "thresholdType=" + thresholdType + "\n" + "maximumThreshold=" + maximumThreshold + "\n"
                + "}";
    }

}