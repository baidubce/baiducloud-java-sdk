package com.baidubce.eip.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DdosAttackRecordModel {
    /**
     * 公网IP
     */
    private String ip;

    /**
     * 攻击开始UTC时间
     */
    private String startTime;

    /**
     * 攻击结束UTC时间
     */
    private String endTime;

    /**
     * 攻击类型
     */
    private List<String> attackType;

    /**
     * 攻击峰值每秒流量带宽Mbps
     */
    private Long attackPeakMbps;

    /**
     * 攻击峰值每秒报文数pps
     */
    private Long attackPeakPps;

    /**
     * 攻击峰值每秒服务请求数qps
     */
    private Long attackPeakQps;

    /**
     * 攻击状态，包含underway攻击中、ended攻击结束
     */
    private String attackStatus;

    public DdosAttackRecordModel setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getIp() {
        return this.ip;
    }

    public DdosAttackRecordModel setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public DdosAttackRecordModel setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public DdosAttackRecordModel setAttackType(List<String> attackType) {
        this.attackType = attackType;
        return this;
    }

    public List<String> getAttackType() {
        return this.attackType;
    }

    public DdosAttackRecordModel setAttackPeakMbps(Long attackPeakMbps) {
        this.attackPeakMbps = attackPeakMbps;
        return this;
    }

    public Long getAttackPeakMbps() {
        return this.attackPeakMbps;
    }

    public DdosAttackRecordModel setAttackPeakPps(Long attackPeakPps) {
        this.attackPeakPps = attackPeakPps;
        return this;
    }

    public Long getAttackPeakPps() {
        return this.attackPeakPps;
    }

    public DdosAttackRecordModel setAttackPeakQps(Long attackPeakQps) {
        this.attackPeakQps = attackPeakQps;
        return this;
    }

    public Long getAttackPeakQps() {
        return this.attackPeakQps;
    }

    public DdosAttackRecordModel setAttackStatus(String attackStatus) {
        this.attackStatus = attackStatus;
        return this;
    }

    public String getAttackStatus() {
        return this.attackStatus;
    }

    @Override
    public String toString() {
        return "DdosAttackRecordModel{" + "ip=" + ip + "\n" + "startTime=" + startTime + "\n" + "endTime=" + endTime + "\n" + "attackType=" + attackType + "\n" + "attackPeakMbps="
                + attackPeakMbps + "\n" + "attackPeakPps=" + attackPeakPps + "\n" + "attackPeakQps=" + attackPeakQps + "\n" + "attackStatus=" + attackStatus + "\n" + "}";
    }

}