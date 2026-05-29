package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateProjectRequest extends BaseBceRequest {

    /**
    * 日志组名称
    */
    private String name;

    /**
    * 日志组描述
    */
    private String description;

    public String getName() {
        return name;
    }

    public CreateProjectRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
