package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateUserPoolRequest extends BaseBceRequest {

    /**
    * 用户池名称（1-64字符，仅允许字母、数字、下划线、连字符）
    */
    private String name;

    /**
    * 用户池描述（最多256字符）
    */
    private String description;

    public String getName() {
        return name;
    }

    public CreateUserPoolRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateUserPoolRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
