package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateUserRequest extends BaseBceRequest {

    /**
    * userName
    */
    @JsonIgnore
    private String userName;

    /**
    * 更新后的用户名
    */
    private String name;

    /**
    * 用户的描述
    */
    private String description;

    /**
    * 用户状态
    */
    private Boolean enabled;

    public String getUserName() {
        return userName;
    }

    public UpdateUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateUserRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateUserRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public UpdateUserRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

}
