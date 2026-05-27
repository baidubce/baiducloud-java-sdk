package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateEniSecurityGroupRequest extends BaseBceRequest {

    /**
    * eniId
    */
    @JsonIgnore
    private String eniId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 普通安全组的id列表
    */
    private List<String> securityGroupIds;

    public String getEniId() {
        return eniId;
    }

    public UpdateEniSecurityGroupRequest setEniId(String eniId) {
        this.eniId = eniId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateEniSecurityGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    public UpdateEniSecurityGroupRequest setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

}
