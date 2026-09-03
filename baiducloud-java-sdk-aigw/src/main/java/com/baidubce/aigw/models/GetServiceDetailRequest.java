package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetServiceDetailRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * serviceName
    */
    @JsonIgnore
    private String serviceName;

    /**
    * xRegion
    */
    @JsonIgnore
    private String xRegion;

    public String getInstanceId() {
        return instanceId;
    }

    public GetServiceDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getServiceName() {
        return serviceName;
    }

    public GetServiceDetailRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public String getXRegion() {
        return xRegion;
    }

    public GetServiceDetailRequest setXRegion(String xRegion) {
        this.xRegion = xRegion;
        return this;
    }

}
