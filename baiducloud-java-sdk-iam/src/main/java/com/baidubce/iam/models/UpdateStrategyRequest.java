package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateStrategyRequest extends BaseBceRequest {

    /**
    * policyName
    */
    @JsonIgnore
    private String policyName;

    /**
    * 新策略名
    */
    private String name;

    /**
    * 策略的描述
    */
    private String description;

    /**
    * 策略内容，ACL格式序列化后得到的String
    */
    private String document;

    public String getPolicyName() {
        return policyName;
    }

    public UpdateStrategyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateStrategyRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateStrategyRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDocument() {
        return document;
    }

    public UpdateStrategyRequest setDocument(String document) {
        this.document = document;
        return this;
    }

}
