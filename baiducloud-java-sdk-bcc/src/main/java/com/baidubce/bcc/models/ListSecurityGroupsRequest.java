package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListSecurityGroupsRequest extends BaseBceRequest {

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

    public ListSecurityGroupsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListSecurityGroupsRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public ListSecurityGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public ListSecurityGroupsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public ListSecurityGroupsRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    public String getSecurityGroupIds() {
        return securityGroupIds;
    }

    public ListSecurityGroupsRequest setSecurityGroupIds(String securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

}
