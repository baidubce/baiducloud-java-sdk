package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteAIGatewayRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * force
    */
    @JsonIgnore
    private Boolean force;

    /**
    * xRegion
    */
    @JsonIgnore
    private String xRegion;

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteAIGatewayRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Boolean getForce() {
        return force;
    }

    public DeleteAIGatewayRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }

    public String getXRegion() {
        return xRegion;
    }

    public DeleteAIGatewayRequest setXRegion(String xRegion) {
        this.xRegion = xRegion;
        return this;
    }

}
