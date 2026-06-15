package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyModelRequest extends BaseBceRequest {

    /**
    * modelId
    */
    @JsonIgnore
    private String modelId;

    /**
    * 模型名称
    */
    private String name;

    /**
    * 描述
    */
    private String description;

    public String getModelId() {
        return modelId;
    }

    public ModifyModelRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    public String getName() {
        return name;
    }

    public ModifyModelRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ModifyModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
