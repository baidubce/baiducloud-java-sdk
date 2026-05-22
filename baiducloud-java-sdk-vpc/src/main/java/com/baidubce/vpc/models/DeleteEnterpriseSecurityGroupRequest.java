package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteEnterpriseSecurityGroupRequest extends BaseBceRequest {

    /**
    * enterpriseSecurityGroupId
    */
    @JsonIgnore
    private String enterpriseSecurityGroupId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getEnterpriseSecurityGroupId() {
        return enterpriseSecurityGroupId;
    }

    public DeleteEnterpriseSecurityGroupRequest setEnterpriseSecurityGroupId(String enterpriseSecurityGroupId) {
        this.enterpriseSecurityGroupId = enterpriseSecurityGroupId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteEnterpriseSecurityGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
