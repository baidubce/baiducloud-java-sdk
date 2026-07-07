package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateUserRequest extends BaseBceRequest {

    /**
    * 用户池 ID
    */
    private String userPoolId;

    /**
    * 用户名（1-64字符，仅允许字母、数字、`_.@-`）
    */
    private String username;

    /**
    * 显示名称（最多64字符）
    */
    private String displayName;

    /**
    * 用户描述（最多128字符）
    */
    private String description;

    /**
    * 用户密码（8-32字符）；不传则用户无密码，仅能通过 IdP 登录
    */
    private String password;

    /**
    * 是否强制用户首次登录时重置密码，默认 false
    */
    private Boolean forceResetPassword;

    public String getUserPoolId() {
        return userPoolId;
    }

    public CreateUserRequest setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public CreateUserRequest setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getDisplayName() {
        return displayName;
    }

    public CreateUserRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateUserRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public CreateUserRequest setPassword(String password) {
        this.password = password;
        return this;
    }

    public Boolean getForceResetPassword() {
        return forceResetPassword;
    }

    public CreateUserRequest setForceResetPassword(Boolean forceResetPassword) {
        this.forceResetPassword = forceResetPassword;
        return this;
    }

}
