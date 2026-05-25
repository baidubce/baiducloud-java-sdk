package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ElasticNetworkCardMountedCloudProductInstanceRequest extends BaseBceRequest {

    /**
    * eniId
    */
    @JsonIgnore
    private String eniId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 绑定的云产品实例ID
    */
    private String instanceId;

    /**
    * 绑定的云产品实例类型，目前取值范围为server/hpas，分别表示云主机/HPAS，默认值为server
    */
    private String instanceType;

    public String getEniId() {
        return eniId;
    }

    public ElasticNetworkCardMountedCloudProductInstanceRequest setEniId(String eniId) {
        this.eniId = eniId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public ElasticNetworkCardMountedCloudProductInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public ElasticNetworkCardMountedCloudProductInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public ElasticNetworkCardMountedCloudProductInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

}
