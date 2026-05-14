package com.baidubce.snic.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateSnicEsgRequest extends BaseBceRequest {

    /**
    * endpointId
    */
    @JsonIgnore
    private String endpointId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 企业安全组的ID列表
    */
    private List<String> enterpriseSecurityGroupIds;

    public String getEndpointId() {
        return endpointId;
    }

    public UpdateSnicEsgRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateSnicEsgRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<String> getEnterpriseSecurityGroupIds() {
        return enterpriseSecurityGroupIds;
    }

    public UpdateSnicEsgRequest setEnterpriseSecurityGroupIds(List<String> enterpriseSecurityGroupIds) {
        this.enterpriseSecurityGroupIds = enterpriseSecurityGroupIds;
        return this;
    }

}
