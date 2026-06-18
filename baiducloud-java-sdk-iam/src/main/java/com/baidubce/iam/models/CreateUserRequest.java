package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateUserRequest extends BaseBceRequest {

    /**
    * 用户名
    */
    private String name;

    /**
    * 用户的描述
    */
    private String description;

    public String getName() {
        return name;
    }

    public CreateUserRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateUserRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
