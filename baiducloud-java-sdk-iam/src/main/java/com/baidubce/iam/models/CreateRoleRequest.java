package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateRoleRequest extends BaseBceRequest {

    /**
    * 角色名
    */
    private String name;

    /**
    * 角色的描述
    */
    private String description;

    /**
    * 指定允许扮演角色的载体
    */
    private String assumeRolePolicyDocument;

    public String getName() {
        return name;
    }

    public CreateRoleRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateRoleRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getAssumeRolePolicyDocument() {
        return assumeRolePolicyDocument;
    }

    public CreateRoleRequest setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
        return this;
    }

}
