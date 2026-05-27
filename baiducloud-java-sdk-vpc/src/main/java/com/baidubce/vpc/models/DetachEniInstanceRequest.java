package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DetachEniInstanceRequest extends BaseBceRequest {

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
    * 要解绑的云产品实例ID
    */
    private String instanceId;

    public String getEniId() {
        return eniId;
    }

    public DetachEniInstanceRequest setEniId(String eniId) {
        this.eniId = eniId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DetachEniInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public DetachEniInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

}
