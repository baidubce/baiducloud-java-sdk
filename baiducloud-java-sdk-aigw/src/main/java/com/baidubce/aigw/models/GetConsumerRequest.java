package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetConsumerRequest extends BaseBceRequest {

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

    public String getInstanceId() {
        return instanceId;
    }

    public GetConsumerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getConsumerId() {
        return consumerId;
    }

    public GetConsumerRequest setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }

    public String getKeyType() {
        return keyType;
    }

    public GetConsumerRequest setKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }

}
