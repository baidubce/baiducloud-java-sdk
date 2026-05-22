package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateARegularSecurityGroupV2Response extends BaseBceResponse {

    /**
    * 已创建的安全组的ID
    */
    private String securityGroupId;

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public CreateARegularSecurityGroupV2Response setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateARegularSecurityGroupV2Response{" + "securityGroupId=" + securityGroupId + "\n" + "}";
    }

}
