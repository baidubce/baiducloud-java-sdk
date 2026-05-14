package com.baidubce.snic.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateSnicSgRequest extends BaseBceRequest {

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
    * 普通安全组的ID列表，需和服务网卡在同一VPC下
    */
    private List<String> securityGroupIds;

    public String getEndpointId() {
        return endpointId;
    }

    public UpdateSnicSgRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateSnicSgRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    public UpdateSnicSgRequest setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

}
