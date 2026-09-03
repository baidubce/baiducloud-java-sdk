package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteServiceRequest extends BaseBceRequest {

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
    * namespace
    */
    @JsonIgnore
    private String namespace;

    /**
    * xRegion
    */
    @JsonIgnore
    private String xRegion;

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteServiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getServiceName() {
        return serviceName;
    }

    public DeleteServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public String getNamespace() {
        return namespace;
    }

    public DeleteServiceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getXRegion() {
        return xRegion;
    }

    public DeleteServiceRequest setXRegion(String xRegion) {
        this.xRegion = xRegion;
        return this;
    }

}
