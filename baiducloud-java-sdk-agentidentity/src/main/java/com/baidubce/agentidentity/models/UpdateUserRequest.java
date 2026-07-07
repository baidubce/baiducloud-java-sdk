package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateUserRequest extends BaseBceRequest {

    /**
    * 用户池 ID
    */
    private String userPoolId;

    /**
    * 用户 ID
    */
    private String id;

    /**
    * 新的显示名称
    */
    private String displayName;

    /**
    * 新的描述
    */
    private String description;

    public String getUserPoolId() {
        return userPoolId;
    }

    public UpdateUserRequest setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    public String getId() {
        return id;
    }

    public UpdateUserRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getDisplayName() {
        return displayName;
    }

    public UpdateUserRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateUserRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
