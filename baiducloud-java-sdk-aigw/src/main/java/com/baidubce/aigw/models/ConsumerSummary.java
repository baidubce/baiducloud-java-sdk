package com.baidubce.aigw.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConsumerSummary {
    /**
     * 消费者 ID
     */
    private String consumerId;

    /**
     * 消费者名称
     */
    private String consumerName;

    /**
     * 描述
     */
    private String description;

    /**
     * 认证类型
     */
    private String authType;

    /**
     * 凭证类型
     */
    private String credentialType;

    /**
     * 标签列表
     */
    private List<Tag> tags;

    /**
     * 路由名称列表
     */
    private List<String> routeNames;

    public ConsumerSummary setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }

    public String getConsumerId() {
        return this.consumerId;
    }

    public ConsumerSummary setConsumerName(String consumerName) {
        this.consumerName = consumerName;
        return this;
    }

    public String getConsumerName() {
        return this.consumerName;
    }

    public ConsumerSummary setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public ConsumerSummary setAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    public String getAuthType() {
        return this.authType;
    }

    public ConsumerSummary setCredentialType(String credentialType) {
        this.credentialType = credentialType;
        return this;
    }

    public String getCredentialType() {
        return this.credentialType;
    }

    public ConsumerSummary setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public ConsumerSummary setRouteNames(List<String> routeNames) {
        this.routeNames = routeNames;
        return this;
    }

    public List<String> getRouteNames() {
        return this.routeNames;
    }

    @Override
    public String toString() {
        return "ConsumerSummary{" + "consumerId=" + consumerId + "\n" + "consumerName=" + consumerName + "\n" + "description=" + description + "\n" + "authType=" + authType + "\n"
                + "credentialType=" + credentialType + "\n" + "tags=" + tags + "\n" + "routeNames=" + routeNames + "\n" + "}";
    }

}