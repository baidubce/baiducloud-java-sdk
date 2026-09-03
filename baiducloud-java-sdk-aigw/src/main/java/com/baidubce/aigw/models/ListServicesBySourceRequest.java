package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListServicesBySourceRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * serviceSource
    */
    @JsonIgnore
    private String serviceSource;

    /**
    * xRegion
    */
    @JsonIgnore
    private String xRegion;

    public String getInstanceId() {
        return instanceId;
    }

    public ListServicesBySourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getServiceSource() {
        return serviceSource;
    }

    public ListServicesBySourceRequest setServiceSource(String serviceSource) {
        this.serviceSource = serviceSource;
        return this;
    }

    public String getXRegion() {
        return xRegion;
    }

    public ListServicesBySourceRequest setXRegion(String xRegion) {
        this.xRegion = xRegion;
        return this;
    }

}
