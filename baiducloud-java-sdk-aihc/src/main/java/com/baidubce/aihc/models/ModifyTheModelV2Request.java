package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyTheModelV2Request extends BaseBceRequest {

    /**
    * 模型名称
    */
    private String name;

    /**
    * 描述
    */
    private String description;

    public String getName() {
        return name;
    }

    public ModifyTheModelV2Request setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ModifyTheModelV2Request setDescription(String description) {
        this.description = description;
        return this;
    }

}
