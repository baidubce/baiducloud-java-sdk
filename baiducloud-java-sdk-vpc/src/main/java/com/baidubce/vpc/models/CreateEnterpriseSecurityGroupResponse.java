package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateEnterpriseSecurityGroupResponse extends BaseBceResponse {

    /**
    * 已创建的企业安全组的ID
    */
    private String enterpriseSecurityGroupId;

    public String getEnterpriseSecurityGroupId() {
        return enterpriseSecurityGroupId;
    }

    public CreateEnterpriseSecurityGroupResponse setEnterpriseSecurityGroupId(String enterpriseSecurityGroupId) {
        this.enterpriseSecurityGroupId = enterpriseSecurityGroupId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateEnterpriseSecurityGroupResponse{" + "enterpriseSecurityGroupId=" + enterpriseSecurityGroupId + "\n" + "}";
    }

}
