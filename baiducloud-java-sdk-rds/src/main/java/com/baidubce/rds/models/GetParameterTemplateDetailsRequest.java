package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetParameterTemplateDetailsRequest extends BaseBceRequest {

    /**
    * templateId
    */
    @JsonIgnore
    private String templateId;

    public String getTemplateId() {
        return templateId;
    }

    public GetParameterTemplateDetailsRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

}
