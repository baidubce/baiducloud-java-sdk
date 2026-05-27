package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryEnterpriseSecurityGroupListRequest extends BaseBceRequest {

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

    public QueryEnterpriseSecurityGroupListRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryEnterpriseSecurityGroupListRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public QueryEnterpriseSecurityGroupListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

}
