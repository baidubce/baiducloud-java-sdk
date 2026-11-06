package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CopyParameterTemplateRequest extends BaseBceRequest {

    /**
    * 复制后模板的名称。
    */
    private String name;

    /**
    * 复制后模板的备注。
    */
    private String desc;

    /**
    * 复制的模板 ID。
    */
    private String templateId;

    public String getName() {
        return name;
    }

    public CopyParameterTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public CopyParameterTemplateRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getTemplateId() {
        return templateId;
    }

    public CopyParameterTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

}
