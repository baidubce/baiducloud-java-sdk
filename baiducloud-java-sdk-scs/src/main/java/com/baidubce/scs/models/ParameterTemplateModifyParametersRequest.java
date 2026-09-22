package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParameterTemplateModifyParametersRequest extends BaseBceRequest {

    /**
    * templateShowId
    */
    @JsonIgnore
    private String templateShowId;

    /**
    * 要添加的参数集合
    */
    private List<Parameters> parameters;

    public String getTemplateShowId() {
        return templateShowId;
    }

    public ParameterTemplateModifyParametersRequest setTemplateShowId(String templateShowId) {
        this.templateShowId = templateShowId;
        return this;
    }

    public List<Parameters> getParameters() {
        return parameters;
    }

    public ParameterTemplateModifyParametersRequest setParameters(List<Parameters> parameters) {
        this.parameters = parameters;
        return this;
    }

}
