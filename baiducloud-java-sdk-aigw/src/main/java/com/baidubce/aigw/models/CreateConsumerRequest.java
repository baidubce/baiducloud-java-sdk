package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateConsumerRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * xRegion
    */
    @JsonIgnore
    private String xRegion;

    /**
    * 消费者名称
    */
    private String consumerName;

    /**
    * 描述
    */
    private String description;

    /**
    * KeyAuth 或 JWT
    */
    private String authType;

    /**
    * LOCAL 或 IAM
    */
    private String credentialType;

    /**
    * 关联路由名称列表
    */
    private List<String> routeNames;

    /**
    * 消费者标签
    */
    private List<Tag> tags;

    /**
    * credential
    */
    private ConsumerCredentialSpec credential;

    /**
    * iamCredential
    */
    private IAMCredentialSpec iamCredential;

    public String getInstanceId() {
        return instanceId;
    }

    public CreateConsumerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getXRegion() {
        return xRegion;
    }

    public CreateConsumerRequest setXRegion(String xRegion) {
        this.xRegion = xRegion;
        return this;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public CreateConsumerRequest setConsumerName(String consumerName) {
        this.consumerName = consumerName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateConsumerRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getAuthType() {
        return authType;
    }

    public CreateConsumerRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    public String getCredentialType() {
        return credentialType;
    }

    public CreateConsumerRequest setCredentialType(String credentialType) {
        this.credentialType = credentialType;
        return this;
    }

    public List<String> getRouteNames() {
        return routeNames;
    }

    public CreateConsumerRequest setRouteNames(List<String> routeNames) {
        this.routeNames = routeNames;
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public CreateConsumerRequest setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public ConsumerCredentialSpec getCredential() {
        return credential;
    }

    public CreateConsumerRequest setCredential(ConsumerCredentialSpec credential) {
        this.credential = credential;
        return this;
    }

    public IAMCredentialSpec getIamCredential() {
        return iamCredential;
    }

    public CreateConsumerRequest setIamCredential(IAMCredentialSpec iamCredential) {
        this.iamCredential = iamCredential;
        return this;
    }

}
