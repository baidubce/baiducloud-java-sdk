package com.baidubce.cprom.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RepeatNotifyConfig {
    /**
     * 是否开启重复通知
     */
    private Boolean enabled;

    /**
     * 重复通知间隔小时数
     */
    private Integer intervalHour;

    /**
     * 重复通知间隔分钟数
     */
    private Integer intervalMin;

    /**
     * 最大重复通知次数
     */
    private Integer maxCount;

    /**
     * 重复通知策略
     */
    private String strategy;

    public RepeatNotifyConfig setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public RepeatNotifyConfig setIntervalHour(Integer intervalHour) {
        this.intervalHour = intervalHour;
        return this;
    }

    public Integer getIntervalHour() {
        return this.intervalHour;
    }

    public RepeatNotifyConfig setIntervalMin(Integer intervalMin) {
        this.intervalMin = intervalMin;
        return this;
    }

    public Integer getIntervalMin() {
        return this.intervalMin;
    }

    public RepeatNotifyConfig setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    public Integer getMaxCount() {
        return this.maxCount;
    }

    public RepeatNotifyConfig setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    public String getStrategy() {
        return this.strategy;
    }

    @Override
    public String toString() {
        return "RepeatNotifyConfig{" + "enabled=" + enabled + "\n" + "intervalHour=" + intervalHour + "\n" + "intervalMin=" + intervalMin + "\n" + "maxCount=" + maxCount + "\n"
                + "strategy=" + strategy + "\n" + "}";
    }

}