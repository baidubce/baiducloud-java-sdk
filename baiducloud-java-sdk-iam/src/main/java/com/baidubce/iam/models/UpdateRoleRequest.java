package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateRoleRequest extends BaseBceRequest {

    /**
    * roleName
    */
    @JsonIgnore
    private String roleName;

    /**
    * 更新后的角色名
    */
    private String name;

    /**
    * 角色的描述
    */
    private String description;

    /**
    * 指定可以扮演此角色的身份
    */
    private String assumeRolePolicyDocument;

    public String getRoleName() {
        return roleName;
    }

    public UpdateRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateRoleRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateRoleRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getAssumeRolePolicyDocument() {
        return assumeRolePolicyDocument;
    }

    public UpdateRoleRequest setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
        return this;
    }

}
