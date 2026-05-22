package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ViewSecurityGroupDetailsV2Request extends BaseBceRequest {

    /**
    * securityGroupId
    */
    @JsonIgnore
    private String securityGroupId;

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public ViewSecurityGroupDetailsV2Request setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

}
