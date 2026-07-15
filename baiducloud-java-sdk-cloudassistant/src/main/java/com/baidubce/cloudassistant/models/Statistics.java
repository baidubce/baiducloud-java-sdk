package com.baidubce.cloudassistant.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Statistics {
    /**
     * 执行的实例总数
     */
    private Integer totalTargetCount;

    /**
     * 已失败的执行实例总数
     */
    private Integer failedTargetCount;

    public Statistics setTotalTargetCount(Integer totalTargetCount) {
        this.totalTargetCount = totalTargetCount;
        return this;
    }

    public Integer getTotalTargetCount() {
        return this.totalTargetCount;
    }

    public Statistics setFailedTargetCount(Integer failedTargetCount) {
        this.failedTargetCount = failedTargetCount;
        return this;
    }

    public Integer getFailedTargetCount() {
        return this.failedTargetCount;
    }

    @Override
    public String toString() {
        return "Statistics{" + "totalTargetCount=" + totalTargetCount + "\n" + "failedTargetCount=" + failedTargetCount + "\n" + "}";
    }

}