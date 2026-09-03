package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateConsumerRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * consumerId
    */
    @JsonIgnore
    private String consumerId;

    /**
    * keyType
    */
    @JsonIgnore
    private String keyType;

    /**
    * xRegion
    */
    @JsonIgnore
    private String xRegion;

    /**
    * 描述
    */
    private String description;

    /**
    * 关联路由列表
    */
    private List<String> routeNames;

    /**
    * 标签列表
    */
    private List<Tag> tags;

    /**
    * credentialOp
    */
    private CredentialOp credentialOp;

    /**
    * credentialLocation
    */
    private ConsumerCredentialLocation credentialLocation;

    /**
    * iamCredential
    */
    private IAMCredentialSpec iamCredential;

    public String getInstanceId() {
        return instanceId;
    }

    public UpdateConsumerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getConsumerId() {
        return consumerId;
    }

    public UpdateConsumerRequest setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }

    public String getKeyType() {
        return keyType;
    }

    public UpdateConsumerRequest setKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }

    public String getXRegion() {
        return xRegion;
    }

    public UpdateConsumerRequest setXRegion(String xRegion) {
        this.xRegion = xRegion;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateConsumerRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<String> getRouteNames() {
        return routeNames;
    }

    public UpdateConsumerRequest setRouteNames(List<String> routeNames) {
        this.routeNames = routeNames;
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public UpdateConsumerRequest setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public CredentialOp getCredentialOp() {
        return credentialOp;
    }

    public UpdateConsumerRequest setCredentialOp(CredentialOp credentialOp) {
        this.credentialOp = credentialOp;
        return this;
    }

    public ConsumerCredentialLocation getCredentialLocation() {
        return credentialLocation;
    }

    public UpdateConsumerRequest setCredentialLocation(ConsumerCredentialLocation credentialLocation) {
        this.credentialLocation = credentialLocation;
        return this;
    }

    public IAMCredentialSpec getIamCredential() {
        return iamCredential;
    }

    public UpdateConsumerRequest setIamCredential(IAMCredentialSpec iamCredential) {
        this.iamCredential = iamCredential;
        return this;
    }

}
