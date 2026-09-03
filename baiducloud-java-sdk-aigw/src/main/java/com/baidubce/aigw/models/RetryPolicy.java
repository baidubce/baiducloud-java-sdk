package com.baidubce.aigw.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RetryPolicy {
    /**
     * 是否启用重试策略
     */
    private Boolean enabled;

    /**
     * 重试条件，多个条件使用逗号分隔
     */
    private String retryConditions;

    /**
     * 重试次数，范围为 1～10
     */
    private Integer numRetries;

    public RetryPolicy setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public RetryPolicy setRetryConditions(String retryConditions) {
        this.retryConditions = retryConditions;
        return this;
    }

    public String getRetryConditions() {
        return this.retryConditions;
    }

    public RetryPolicy setNumRetries(Integer numRetries) {
        this.numRetries = numRetries;
        return this;
    }

    public Integer getNumRetries() {
        return this.numRetries;
    }

    @Override
    public String toString() {
        return "RetryPolicy{" + "enabled=" + enabled + "\n" + "retryConditions=" + retryConditions + "\n" + "numRetries=" + numRetries + "\n" + "}";
    }

}