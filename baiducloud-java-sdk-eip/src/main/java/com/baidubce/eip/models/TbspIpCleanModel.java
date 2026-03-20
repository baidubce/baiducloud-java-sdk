package com.baidubce.eip.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TbspIpCleanModel {
    /**
     * DDoS增强防护包防护对象IP地址
     */
    private String ip;

    /**
     * DDoS增强防护包防护对象IP名称
     */
    private String eipName;

    /**
     * DDoS增强防护包防护对象EIP ID
     */
    private String eipId;

    /**
     * DDoS增强防护包IP清洗阈值类型，包含按带宽上限 (bandwidth)、智能阈值 (auto) 和手动设置 (manual)
     */
    private String thresholdType;

    /**
     * 清洗阈值每秒流量带宽Mbps
     */
    private Integer ipCleanMbps;

    /**
     * 清洗阈值每秒报文数pps
     */
    private Integer ipCleanPps;

    /**
     * 防护等级，1（宽松）、2（适中）、3（严格）
     */
    private String protectLevel;

    /**
     * 关闭防护IP清洗起始时间
     */
    private String turnOffBeginTime;

    /**
     * 关闭防护IP清洗终止时间
     */
    private String turnOffEndTime;

    public TbspIpCleanModel setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getIp() {
        return this.ip;
    }

    public TbspIpCleanModel setEipName(String eipName) {
        this.eipName = eipName;
        return this;
    }

    public String getEipName() {
        return this.eipName;
    }

    public TbspIpCleanModel setEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }

    public String getEipId() {
        return this.eipId;
    }

    public TbspIpCleanModel setThresholdType(String thresholdType) {
        this.thresholdType = thresholdType;
        return this;
    }

    public String getThresholdType() {
        return this.thresholdType;
    }

    public TbspIpCleanModel setIpCleanMbps(Integer ipCleanMbps) {
        this.ipCleanMbps = ipCleanMbps;
        return this;
    }

    public Integer getIpCleanMbps() {
        return this.ipCleanMbps;
    }

    public TbspIpCleanModel setIpCleanPps(Integer ipCleanPps) {
        this.ipCleanPps = ipCleanPps;
        return this;
    }

    public Integer getIpCleanPps() {
        return this.ipCleanPps;
    }

    public TbspIpCleanModel setProtectLevel(String protectLevel) {
        this.protectLevel = protectLevel;
        return this;
    }

    public String getProtectLevel() {
        return this.protectLevel;
    }

    public TbspIpCleanModel setTurnOffBeginTime(String turnOffBeginTime) {
        this.turnOffBeginTime = turnOffBeginTime;
        return this;
    }

    public String getTurnOffBeginTime() {
        return this.turnOffBeginTime;
    }

    public TbspIpCleanModel setTurnOffEndTime(String turnOffEndTime) {
        this.turnOffEndTime = turnOffEndTime;
        return this;
    }

    public String getTurnOffEndTime() {
        return this.turnOffEndTime;
    }

    @Override
    public String toString() {
        return "TbspIpCleanModel{" + "ip=" + ip + "\n" + "eipName=" + eipName + "\n" + "eipId=" + eipId + "\n" + "thresholdType=" + thresholdType + "\n" + "ipCleanMbps="
                + ipCleanMbps + "\n" + "ipCleanPps=" + ipCleanPps + "\n" + "protectLevel=" + protectLevel + "\n" + "turnOffBeginTime=" + turnOffBeginTime + "\n"
                + "turnOffEndTime=" + turnOffEndTime + "\n" + "}";
    }

}