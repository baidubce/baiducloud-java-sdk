package com.baidubce.cprom.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CallbackConfig {
    /**
     * 回调类型，weCom:企业微信，dingTalk:钉钉，lark:飞书，custom:自定义webhook
     */
    private String webhookType;

    /**
     * webhook配置详情列表
     */
    private List<WebhookDetail> webhookList;

    public CallbackConfig setWebhookType(String webhookType) {
        this.webhookType = webhookType;
        return this;
    }

    public String getWebhookType() {
        return this.webhookType;
    }

    public CallbackConfig setWebhookList(List<WebhookDetail> webhookList) {
        this.webhookList = webhookList;
        return this;
    }

    public List<WebhookDetail> getWebhookList() {
        return this.webhookList;
    }

    @Override
    public String toString() {
        return "CallbackConfig{" + "webhookType=" + webhookType + "\n" + "webhookList=" + webhookList + "\n" + "}";
    }

}