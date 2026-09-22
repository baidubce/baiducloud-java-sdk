package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParameterTemplateDeleteParametersRequest extends BaseBceRequest {

    /**
    * templateShowId
    */
    @JsonIgnore
    private String templateShowId;

    /**
    * 要删除的参数名称集合
    */
    private List<String> parameters;

    public String getTemplateShowId() {
        return templateShowId;
    }

    public ParameterTemplateDeleteParametersRequest setTemplateShowId(String templateShowId) {
        this.templateShowId = templateShowId;
        return this;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public ParameterTemplateDeleteParametersRequest setParameters(List<String> parameters) {
        this.parameters = parameters;
        return this;
    }

}
