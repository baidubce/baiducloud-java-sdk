package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetUserRequest extends BaseBceRequest {

    /**
    * 用户池 ID
    */
    private String userPoolId;

    /**
    * （二选一）用户 ID
    */
    private String id;

    /**
    * （二选一）用户名
    */
    private String username;

    public String getUserPoolId() {
        return userPoolId;
    }

    public GetUserRequest setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    public String getId() {
        return id;
    }

    public GetUserRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public GetUserRequest setUsername(String username) {
        this.username = username;
        return this;
    }

}
