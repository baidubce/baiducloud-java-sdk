package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteRegularSecurityGroupV2Request extends BaseBceRequest {

    /**
    * securityGroupId
    */
    @JsonIgnore
    private String securityGroupId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public DeleteRegularSecurityGroupV2Request setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteRegularSecurityGroupV2Request setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
