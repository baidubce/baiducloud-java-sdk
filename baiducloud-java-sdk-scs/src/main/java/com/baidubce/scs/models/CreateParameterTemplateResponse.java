package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateParameterTemplateResponse extends BaseBceResponse {

    /**
    * 参数模版数字ID
    */
    private Integer templateId;

    /**
    * 参数模版展示ID
    */
    private String templateShowId;

    public Integer getTemplateId() {
        return templateId;
    }

    public CreateParameterTemplateResponse setTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }

    public String getTemplateShowId() {
        return templateShowId;
    }

    public CreateParameterTemplateResponse setTemplateShowId(String templateShowId) {
        this.templateShowId = templateShowId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateParameterTemplateResponse{" + "templateId=" + templateId + "\n" + "templateShowId=" + templateShowId + "\n" + "}";
    }

}
