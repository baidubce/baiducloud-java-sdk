package com.baidubce.iam.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoleModel {
    /**
     * 角色id
     */
    private String id;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 角色描述
     */
    private String description;

    /**
     * 指定允许扮演此角色的实体
     */
    private String assumeRolePolicyDocument;

    public RoleModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public RoleModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public RoleModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public RoleModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public RoleModel setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
        return this;
    }

    public String getAssumeRolePolicyDocument() {
        return this.assumeRolePolicyDocument;
    }

    @Override
    public String toString() {
        return "RoleModel{" + "id=" + id + "\n" + "name=" + name + "\n" + "createTime=" + createTime + "\n" + "description=" + description + "\n" + "assumeRolePolicyDocument="
                + assumeRolePolicyDocument + "\n" + "}";
    }

}