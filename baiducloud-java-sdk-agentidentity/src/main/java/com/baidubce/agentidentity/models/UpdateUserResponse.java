package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateUserResponse extends BaseBceResponse {

    /**
    * 用户 ID
    */
    private String id;

    /**
    * 用户名
    */
    private String username;

    /**
    * 显示名称
    */
    private String displayName;

    /**
    * 描述
    */
    private String description;

    /**
    * 来源：MANUAL / AUTO
    */
    private String source;

    /**
    * 是否已设置密码
    */
    private Boolean hasPassword;

    /**
    * 创建时间
    */
    private String createdAt;

    public String getId() {
        return id;
    }

    public UpdateUserResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UpdateUserResponse setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getDisplayName() {
        return displayName;
    }

    public UpdateUserResponse setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateUserResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getSource() {
        return source;
    }

    public UpdateUserResponse setSource(String source) {
        this.source = source;
        return this;
    }

    public Boolean getHasPassword() {
        return hasPassword;
    }

    public UpdateUserResponse setHasPassword(Boolean hasPassword) {
        this.hasPassword = hasPassword;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public UpdateUserResponse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return "UpdateUserResponse{" + "id=" + id + "\n" + "username=" + username + "\n" + "displayName=" + displayName + "\n" + "description=" + description + "\n" + "source="
                + source + "\n" + "hasPassword=" + hasPassword + "\n" + "createdAt=" + createdAt + "\n" + "}";
    }

}
