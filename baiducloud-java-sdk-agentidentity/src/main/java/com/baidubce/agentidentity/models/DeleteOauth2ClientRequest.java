package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteOauth2ClientRequest extends BaseBceRequest {

    /**
    * 用户池 ID
    */
    private String userPoolId;

    /**
    * 客户端记录 ID
    */
    private String id;

    public String getUserPoolId() {
        return userPoolId;
    }

    public DeleteOauth2ClientRequest setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    public String getId() {
        return id;
    }

    public DeleteOauth2ClientRequest setId(String id) {
        this.id = id;
        return this;
    }

}
