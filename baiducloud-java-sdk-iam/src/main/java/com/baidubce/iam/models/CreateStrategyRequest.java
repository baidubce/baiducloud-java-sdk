package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateStrategyRequest extends BaseBceRequest {

    /**
    * 组名
    */
    private String name;

    /**
    * 组的描述
    */
    private String description;

    /**
    * 策略内容，ACL格式序列化后得到的String
    */
    private String document;

    public String getName() {
        return name;
    }

    public CreateStrategyRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateStrategyRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDocument() {
        return document;
    }

    public CreateStrategyRequest setDocument(String document) {
        this.document = document;
        return this;
    }

}
