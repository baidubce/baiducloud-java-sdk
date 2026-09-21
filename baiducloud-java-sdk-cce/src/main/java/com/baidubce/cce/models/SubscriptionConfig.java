package com.baidubce.cce.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubscriptionConfig {
    /**
     * 必填。是否开启报告订阅
     */
    private Boolean isSubscriptionEnabled;

    /**
     * 必填。报告发送频率
     */
    private String subscriptionFrequency;

    /**
     * 必填。接收方式列表
     */
    private List<ReceiveAddr> receiveMethod;

    public SubscriptionConfig setIsSubscriptionEnabled(Boolean isSubscriptionEnabled) {
        this.isSubscriptionEnabled = isSubscriptionEnabled;
        return this;
    }

    public Boolean getIsSubscriptionEnabled() {
        return this.isSubscriptionEnabled;
    }

    public SubscriptionConfig setSubscriptionFrequency(String subscriptionFrequency) {
        this.subscriptionFrequency = subscriptionFrequency;
        return this;
    }

    public String getSubscriptionFrequency() {
        return this.subscriptionFrequency;
    }

    public SubscriptionConfig setReceiveMethod(List<ReceiveAddr> receiveMethod) {
        this.receiveMethod = receiveMethod;
        return this;
    }

    public List<ReceiveAddr> getReceiveMethod() {
        return this.receiveMethod;
    }

    @Override
    public String toString() {
        return "SubscriptionConfig{" + "isSubscriptionEnabled=" + isSubscriptionEnabled + "\n" + "subscriptionFrequency=" + subscriptionFrequency + "\n" + "receiveMethod="
                + receiveMethod + "\n" + "}";
    }

}