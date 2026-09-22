package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteParameterTemplateRequest extends BaseBceRequest {

    /**
    * templateShowId
    */
    @JsonIgnore
    private String templateShowId;

    public String getTemplateShowId() {
        return templateShowId;
    }

    public DeleteParameterTemplateRequest setTemplateShowId(String templateShowId) {
        this.templateShowId = templateShowId;
        return this;
    }

}
