package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteUserRequest extends BaseBceRequest {

    /**
    * 用户池 ID
    */
    private String userPoolId;

    /**
    * 用户 ID
    */
    private String id;

    public String getUserPoolId() {
        return userPoolId;
    }

    public DeleteUserRequest setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    public String getId() {
        return id;
    }

    public DeleteUserRequest setId(String id) {
        this.id = id;
        return this;
    }

}
