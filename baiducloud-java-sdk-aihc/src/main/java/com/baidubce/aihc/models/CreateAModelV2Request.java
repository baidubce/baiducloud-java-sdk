package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAModelV2Request extends BaseBceRequest {

    /**
    * 模型名称支持小写字母、数字和-，必须以小写字母开头，必须以小写字母或数字结尾，长度限制1-50。
    */
    private String name;

    /**
    * 描述
    */
    private String description;

    /**
    * 模型格式，HuggingFace、MegatronCore等
    */
    private String modelFormat;

    /**
    * 所有者，不传递时默认为创建者
    */
    private String owner;

    /**
    * 可见范围ONLY_OWNER：仅所有者可读写
    */
    private String visibilityScope;

    /**
    * initVersionEntry
    */
    private ModelVersionEntry initVersionEntry;

    public String getName() {
        return name;
    }

    public CreateAModelV2Request setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateAModelV2Request setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getModelFormat() {
        return modelFormat;
    }

    public CreateAModelV2Request setModelFormat(String modelFormat) {
        this.modelFormat = modelFormat;
        return this;
    }

    public String getOwner() {
        return owner;
    }

    public CreateAModelV2Request setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getVisibilityScope() {
        return visibilityScope;
    }

    public CreateAModelV2Request setVisibilityScope(String visibilityScope) {
        this.visibilityScope = visibilityScope;
        return this;
    }

    public ModelVersionEntry getInitVersionEntry() {
        return initVersionEntry;
    }

    public CreateAModelV2Request setInitVersionEntry(ModelVersionEntry initVersionEntry) {
        this.initVersionEntry = initVersionEntry;
        return this;
    }

}
