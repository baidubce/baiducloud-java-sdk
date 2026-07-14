package com.baidubce.as.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EipGroupIncrease {
    /**
     * 是否开启
     */
    private Boolean enabled;

    /**
     * 扩容策略
     */
    private String strategy;

    public EipGroupIncrease setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public EipGroupIncrease setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    public String getStrategy() {
        return this.strategy;
    }

    @Override
    public String toString() {
        return "EipGroupIncrease{" + "enabled=" + enabled + "\n" + "strategy=" + strategy + "\n" + "}";
    }

}