package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTheListOfEnterpriseSecurityGroupsRequest extends BaseBceRequest {

    /**
    * marker
    */
    @JsonIgnore
    private String marker;

    /**
    * maxKeys
    */
    @JsonIgnore
    private Integer maxKeys;

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    public String getMarker() {
        return marker;
    }

    public QueryTheListOfEnterpriseSecurityGroupsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryTheListOfEnterpriseSecurityGroupsRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public QueryTheListOfEnterpriseSecurityGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

}
