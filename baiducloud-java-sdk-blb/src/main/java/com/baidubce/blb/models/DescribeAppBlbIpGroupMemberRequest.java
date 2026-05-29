package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAppBlbIpGroupMemberRequest extends BaseBceRequest {

    /**
    * blbId
    */
    @JsonIgnore
    private String blbId;

    /**
    * ipGroupId
    */
    @JsonIgnore
    private String ipGroupId;

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

    public String getBlbId() {
        return blbId;
    }

    public DescribeAppBlbIpGroupMemberRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getIpGroupId() {
        return ipGroupId;
    }

    public DescribeAppBlbIpGroupMemberRequest setIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public DescribeAppBlbIpGroupMemberRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public DescribeAppBlbIpGroupMemberRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

}
