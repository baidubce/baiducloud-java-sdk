package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BindBlbSecurityGroupRequest extends BaseBceRequest {

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
    * 绑定的普通安全组ID列表
    */
    private List<String> securityGroupIds;

    public String getBlbId() {
        return blbId;
    }

    public BindBlbSecurityGroupRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public BindBlbSecurityGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    public BindBlbSecurityGroupRequest setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

}
