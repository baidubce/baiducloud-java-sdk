package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UnbindBlbEnterpriseSecurityGroupRequest extends BaseBceRequest {

    /**
    * blbId
    */
    @JsonIgnore
    private String blbId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 解绑的企业安全组ID列表
    */
    private List<String> enterpriseSecurityGroupIds;

    public String getBlbId() {
        return blbId;
    }

    public UnbindBlbEnterpriseSecurityGroupRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UnbindBlbEnterpriseSecurityGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<String> getEnterpriseSecurityGroupIds() {
        return enterpriseSecurityGroupIds;
    }

    public UnbindBlbEnterpriseSecurityGroupRequest setEnterpriseSecurityGroupIds(List<String> enterpriseSecurityGroupIds) {
        this.enterpriseSecurityGroupIds = enterpriseSecurityGroupIds;
        return this;
    }

}
