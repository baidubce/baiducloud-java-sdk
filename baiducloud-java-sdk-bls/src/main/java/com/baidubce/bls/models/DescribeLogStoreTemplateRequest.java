package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLogStoreTemplateRequest extends BaseBceRequest {

    /**
    * 模板名称
    */
    private String name;

    public String getName() {
        return name;
    }

    public DescribeLogStoreTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }

}
