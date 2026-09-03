package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteConsumerRequest extends BaseBceRequest {

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

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteConsumerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getConsumerId() {
        return consumerId;
    }

    public DeleteConsumerRequest setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }

    public String getKeyType() {
        return keyType;
    }

    public DeleteConsumerRequest setKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }

    public String getXRegion() {
        return xRegion;
    }

    public DeleteConsumerRequest setXRegion(String xRegion) {
        this.xRegion = xRegion;
        return this;
    }

}
