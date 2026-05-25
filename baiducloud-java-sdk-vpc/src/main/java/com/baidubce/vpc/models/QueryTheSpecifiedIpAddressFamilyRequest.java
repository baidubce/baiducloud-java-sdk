package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTheSpecifiedIpAddressFamilyRequest extends BaseBceRequest {

    /**
    * ipGroupId
    */
    @JsonIgnore
    private String ipGroupId;

    public String getIpGroupId() {
        return ipGroupId;
    }

    public QueryTheSpecifiedIpAddressFamilyRequest setIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
        return this;
    }

}
