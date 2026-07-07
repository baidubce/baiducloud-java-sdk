package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DisableIdpConfigurationRequest extends BaseBceRequest {

    /**
    * 用户池 ID
    */
    private String userPoolId;

    /**
    * IdP 配置 ID
    */
    private String id;

    public String getUserPoolId() {
        return userPoolId;
    }

    public DisableIdpConfigurationRequest setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    public String getId() {
        return id;
    }

    public DisableIdpConfigurationRequest setId(String id) {
        this.id = id;
        return this;
    }

}
