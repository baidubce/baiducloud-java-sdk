package com.baidubce.aigw.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConsumerDetailInfo {
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
     * 路由名称列表
     */
    private List<String> routeNames;

    /**
     * 标签列表
     */
    private List<Tag> tags;

    /**
     * 凭证详情
     */
    private List<ConsumerCredentialInfo> credentials;

    /**
     * iamCredential
     */
    private IAMCredentialSpec iamCredential;

    public ConsumerDetailInfo setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }

    public String getConsumerId() {
        return this.consumerId;
    }

    public ConsumerDetailInfo setConsumerName(String consumerName) {
        this.consumerName = consumerName;
        return this;
    }

    public String getConsumerName() {
        return this.consumerName;
    }

    public ConsumerDetailInfo setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public ConsumerDetailInfo setAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    public String getAuthType() {
        return this.authType;
    }

    public ConsumerDetailInfo setCredentialType(String credentialType) {
        this.credentialType = credentialType;
        return this;
    }

    public String getCredentialType() {
        return this.credentialType;
    }

    public ConsumerDetailInfo setRouteNames(List<String> routeNames) {
        this.routeNames = routeNames;
        return this;
    }

    public List<String> getRouteNames() {
        return this.routeNames;
    }

    public ConsumerDetailInfo setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public ConsumerDetailInfo setCredentials(List<ConsumerCredentialInfo> credentials) {
        this.credentials = credentials;
        return this;
    }

    public List<ConsumerCredentialInfo> getCredentials() {
        return this.credentials;
    }

    public ConsumerDetailInfo setIamCredential(IAMCredentialSpec iamCredential) {
        this.iamCredential = iamCredential;
        return this;
    }

    public IAMCredentialSpec getIamCredential() {
        return this.iamCredential;
    }

    @Override
    public String toString() {
        return "ConsumerDetailInfo{" + "consumerId=" + consumerId + "\n" + "consumerName=" + consumerName + "\n" + "description=" + description + "\n" + "authType=" + authType
                + "\n" + "credentialType=" + credentialType + "\n" + "routeNames=" + routeNames + "\n" + "tags=" + tags + "\n" + "credentials=" + credentials + "\n"
                + "iamCredential=" + iamCredential + "\n" + "}";
    }

}