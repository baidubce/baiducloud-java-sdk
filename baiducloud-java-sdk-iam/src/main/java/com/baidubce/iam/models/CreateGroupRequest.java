package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateGroupRequest extends BaseBceRequest {

    /**
    * 组名
    */
    private String name;

    /**
    * 组的描述
    */
    private String description;

    public String getName() {
        return name;
    }

    public CreateGroupRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
