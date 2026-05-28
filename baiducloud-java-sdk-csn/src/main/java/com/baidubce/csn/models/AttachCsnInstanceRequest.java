package com.baidubce.csn.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttachCsnInstanceRequest extends BaseBceRequest {

    /**
    * csnId
    */
    @JsonIgnore
    private String csnId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 加载的实例类型，取值 [ vpc \| channel \| bec_vpc ]，分别表示私有网络、专线通道、边缘网络
    */
    private String instanceType;

    /**
    * 加载的实例ID
    */
    private String instanceId;

    /**
    * 加载的实例所属的region
    */
    private String instanceRegion;

    /**
    * 跨账号加载网络实例场景下，网络实例所属账号的ID
    */
    private String instanceAccountId;

    public String getCsnId() {
        return csnId;
    }

    public AttachCsnInstanceRequest setCsnId(String csnId) {
        this.csnId = csnId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public AttachCsnInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public AttachCsnInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public AttachCsnInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceRegion() {
        return instanceRegion;
    }

    public AttachCsnInstanceRequest setInstanceRegion(String instanceRegion) {
        this.instanceRegion = instanceRegion;
        return this;
    }

    public String getInstanceAccountId() {
        return instanceAccountId;
    }

    public AttachCsnInstanceRequest setInstanceAccountId(String instanceAccountId) {
        this.instanceAccountId = instanceAccountId;
        return this;
    }

}
