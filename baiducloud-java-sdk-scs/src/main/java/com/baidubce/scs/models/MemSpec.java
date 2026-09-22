package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MemSpec {
    /**
     * 触发规格自动扩容的内存平均利用率阈值，单位为%，取值：70、80、90    。
     */
    private Integer memUsageUpperThreshold;

    /**
     * 触发规格自动缩容的内存平均利用率阈值，单位为% ，取值：20、30、40  。
     */
    private Integer memUsageDownThreshold;

    /**
     * 扩容规格上限
     */
    private String maxNodeType;

    /**
     * 缩容规格下限
     */
    private String minNodeType;

    /**
     * 观测窗口。参数值由数值和时间单位后缀组成，支持的数据库实例及其取值如下（其中时间后缀m表示分钟，h表示小时）：1m，3m、5m、10m、15m、30m。
     */
    private String observationWindowSizeForUpper;

    /**
     * 观测窗口。参数值由数值和时间单位后缀组成，支持的数据库实例及其取值如下，（其中时间后缀m表示分钟，h表示小时）：5m、10m、15m、30m。
     */
    private String observationWindowSizeForDown;

    public MemSpec setMemUsageUpperThreshold(Integer memUsageUpperThreshold) {
        this.memUsageUpperThreshold = memUsageUpperThreshold;
        return this;
    }

    public Integer getMemUsageUpperThreshold() {
        return this.memUsageUpperThreshold;
    }

    public MemSpec setMemUsageDownThreshold(Integer memUsageDownThreshold) {
        this.memUsageDownThreshold = memUsageDownThreshold;
        return this;
    }

    public Integer getMemUsageDownThreshold() {
        return this.memUsageDownThreshold;
    }

    public MemSpec setMaxNodeType(String maxNodeType) {
        this.maxNodeType = maxNodeType;
        return this;
    }

    public String getMaxNodeType() {
        return this.maxNodeType;
    }

    public MemSpec setMinNodeType(String minNodeType) {
        this.minNodeType = minNodeType;
        return this;
    }

    public String getMinNodeType() {
        return this.minNodeType;
    }

    public MemSpec setObservationWindowSizeForUpper(String observationWindowSizeForUpper) {
        this.observationWindowSizeForUpper = observationWindowSizeForUpper;
        return this;
    }

    public String getObservationWindowSizeForUpper() {
        return this.observationWindowSizeForUpper;
    }

    public MemSpec setObservationWindowSizeForDown(String observationWindowSizeForDown) {
        this.observationWindowSizeForDown = observationWindowSizeForDown;
        return this;
    }

    public String getObservationWindowSizeForDown() {
        return this.observationWindowSizeForDown;
    }

    @Override
    public String toString() {
        return "MemSpec{" + "memUsageUpperThreshold=" + memUsageUpperThreshold + "\n" + "memUsageDownThreshold=" + memUsageDownThreshold + "\n" + "maxNodeType=" + maxNodeType
                + "\n" + "minNodeType=" + minNodeType + "\n" + "observationWindowSizeForUpper=" + observationWindowSizeForUpper + "\n" + "observationWindowSizeForDown="
                + observationWindowSizeForDown + "\n" + "}";
    }

}