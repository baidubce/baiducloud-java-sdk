package com.baidubce.iam.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserModel {
    /**
     * 用户id
     */
    private String id;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 加入用户组时间
     */
    private String joinTime;

    /**
     * 最后登录时间
     */
    private String lastLoginTime;

    /**
     * 用户描述
     */
    private String description;

    /**
     * 用户启用状态
     */
    private Boolean enabled;

    public UserModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public UserModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public UserModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public UserModel setJoinTime(String joinTime) {
        this.joinTime = joinTime;
        return this;
    }

    public String getJoinTime() {
        return this.joinTime;
    }

    public UserModel setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
        return this;
    }

    public String getLastLoginTime() {
        return this.lastLoginTime;
    }

    public UserModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public UserModel setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    @Override
    public String toString() {
        return "UserModel{" + "id=" + id + "\n" + "name=" + name + "\n" + "createTime=" + createTime + "\n" + "joinTime=" + joinTime + "\n" + "lastLoginTime=" + lastLoginTime
                + "\n" + "description=" + description + "\n" + "enabled=" + enabled + "\n" + "}";
    }

}