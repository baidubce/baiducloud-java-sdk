package com.baidubce.dbsc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SCSSlowLogSummaryItem {
    /**
     * 命令模版
     */
    private String fingerprint;

    /**
     * 执行次数
     */
    private Long executeTimes;

    /**
     * 执行时间总和
     */
    private Float durationSum;

    /**
     * 最大执行时间
     */
    private Float durationMax;

    /**
     * 平均执行时间
     */
    private Float durationAvg;

    public SCSSlowLogSummaryItem setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    public String getFingerprint() {
        return this.fingerprint;
    }

    public SCSSlowLogSummaryItem setExecuteTimes(Long executeTimes) {
        this.executeTimes = executeTimes;
        return this;
    }

    public Long getExecuteTimes() {
        return this.executeTimes;
    }

    public SCSSlowLogSummaryItem setDurationSum(Float durationSum) {
        this.durationSum = durationSum;
        return this;
    }

    public Float getDurationSum() {
        return this.durationSum;
    }

    public SCSSlowLogSummaryItem setDurationMax(Float durationMax) {
        this.durationMax = durationMax;
        return this;
    }

    public Float getDurationMax() {
        return this.durationMax;
    }

    public SCSSlowLogSummaryItem setDurationAvg(Float durationAvg) {
        this.durationAvg = durationAvg;
        return this;
    }

    public Float getDurationAvg() {
        return this.durationAvg;
    }

    @Override
    public String toString() {
        return "SCSSlowLogSummaryItem{" + "fingerprint=" + fingerprint + "\n" + "executeTimes=" + executeTimes + "\n" + "durationSum=" + durationSum + "\n" + "durationMax="
                + durationMax + "\n" + "durationAvg=" + durationAvg + "\n" + "}";
    }

}