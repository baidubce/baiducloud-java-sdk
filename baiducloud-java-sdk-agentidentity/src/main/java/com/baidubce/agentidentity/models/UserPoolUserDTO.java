package com.baidubce.agentidentity.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserPoolUserDTO {
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

    public UserPoolUserDTO setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public UserPoolUserDTO setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getUsername() {
        return this.username;
    }

    public UserPoolUserDTO setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public UserPoolUserDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public UserPoolUserDTO setSource(String source) {
        this.source = source;
        return this;
    }

    public String getSource() {
        return this.source;
    }

    public UserPoolUserDTO setHasPassword(Boolean hasPassword) {
        this.hasPassword = hasPassword;
        return this;
    }

    public Boolean getHasPassword() {
        return this.hasPassword;
    }

    public UserPoolUserDTO setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public String toString() {
        return "UserPoolUserDTO{" + "id=" + id + "\n" + "username=" + username + "\n" + "displayName=" + displayName + "\n" + "description=" + description + "\n" + "source="
                + source + "\n" + "hasPassword=" + hasPassword + "\n" + "createdAt=" + createdAt + "\n" + "}";
    }

}