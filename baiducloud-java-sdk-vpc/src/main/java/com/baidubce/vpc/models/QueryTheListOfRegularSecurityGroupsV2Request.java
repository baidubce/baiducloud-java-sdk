package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTheListOfRegularSecurityGroupsV2Request extends BaseBceRequest {

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

    /**
    * vpcId
    */
    @JsonIgnore
    private String vpcId;

    /**
    * securityGroupId
    */
    @JsonIgnore
    private String securityGroupId;

    /**
    * securityGroupIds
    */
    @JsonIgnore
    private String securityGroupIds;

    public String getMarker() {
        return marker;
    }

    public QueryTheListOfRegularSecurityGroupsV2Request setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryTheListOfRegularSecurityGroupsV2Request setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public QueryTheListOfRegularSecurityGroupsV2Request setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public QueryTheListOfRegularSecurityGroupsV2Request setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public QueryTheListOfRegularSecurityGroupsV2Request setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    public String getSecurityGroupIds() {
        return securityGroupIds;
    }

    public QueryTheListOfRegularSecurityGroupsV2Request setSecurityGroupIds(String securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

}
