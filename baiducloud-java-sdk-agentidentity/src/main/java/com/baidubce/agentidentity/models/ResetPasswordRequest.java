package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResetPasswordRequest extends BaseBceRequest {

    /**
    * 用户池 ID
    */
    private String userPoolId;

    /**
    * 用户 ID
    */
    private String userId;

    /**
    * 新密码（8-32字符，须含大写、小写、数字）
    */
    private String newPassword;

    /**
    * 当前密码；传入时校验当前密码，适用于用户自行修改场景；不传则为管理员重置，跳过校验
    */
    private String password;

    /**
    * 是否强制用户下次登录时重置密码，默认 true
    */
    private Boolean forceResetPassword;

    public String getUserPoolId() {
        return userPoolId;
    }

    public ResetPasswordRequest setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public ResetPasswordRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public ResetPasswordRequest setNewPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public ResetPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }

    public Boolean getForceResetPassword() {
        return forceResetPassword;
    }

    public ResetPasswordRequest setForceResetPassword(Boolean forceResetPassword) {
        this.forceResetPassword = forceResetPassword;
        return this;
    }

}
