package com.baidubce.sts.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssumeRoleRequest extends BaseBceRequest {

    /**
    * durationSeconds
    */
    @JsonIgnore
    private String durationSeconds;

    /**
    * accountId
    */
    @JsonIgnore
    private String accountId;

    /**
    * userId
    */
    @JsonIgnore
    private String userId;

    /**
    * roleName
    */
    @JsonIgnore
    private String roleName;

    /**
    * 为临时身份凭证绑定的权限
    */
    private String accessControlList;

    public String getDurationSeconds() {
        return durationSeconds;
    }

    public AssumeRoleRequest setDurationSeconds(String durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    public String getAccountId() {
        return accountId;
    }

    public AssumeRoleRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public AssumeRoleRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getRoleName() {
        return roleName;
    }

    public AssumeRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    public String getAccessControlList() {
        return accessControlList;
    }

    public AssumeRoleRequest setAccessControlList(String accessControlList) {
        this.accessControlList = accessControlList;
        return this;
    }

}
