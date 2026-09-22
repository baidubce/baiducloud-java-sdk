package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DelayInfoConsoleItem {
    /**
     * 源端集群
     */
    private String sourceCluster;

    /**
     * 目标端集群
     */
    private String destCluster;

    /**
     * 延迟信息
     */
    private Long delayResult;

    /**
     * 延迟时间
     */
    private Long timeResult;

    public DelayInfoConsoleItem setSourceCluster(String sourceCluster) {
        this.sourceCluster = sourceCluster;
        return this;
    }

    public String getSourceCluster() {
        return this.sourceCluster;
    }

    public DelayInfoConsoleItem setDestCluster(String destCluster) {
        this.destCluster = destCluster;
        return this;
    }

    public String getDestCluster() {
        return this.destCluster;
    }

    public DelayInfoConsoleItem setDelayResult(Long delayResult) {
        this.delayResult = delayResult;
        return this;
    }

    public Long getDelayResult() {
        return this.delayResult;
    }

    public DelayInfoConsoleItem setTimeResult(Long timeResult) {
        this.timeResult = timeResult;
        return this;
    }

    public Long getTimeResult() {
        return this.timeResult;
    }

    @Override
    public String toString() {
        return "DelayInfoConsoleItem{" + "sourceCluster=" + sourceCluster + "\n" + "destCluster=" + destCluster + "\n" + "delayResult=" + delayResult + "\n" + "timeResult="
                + timeResult + "\n" + "}";
    }

}