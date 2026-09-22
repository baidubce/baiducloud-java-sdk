package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetParameterListResponse extends BaseBceResponse {

    /**
    * 参数列表
    */
    private List<Parameter> parameters;

    public List<Parameter> getParameters() {
        return parameters;
    }

    public GetParameterListResponse setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    @Override
    public String toString() {
        return "GetParameterListResponse{" + "parameters=" + parameters + "\n" + "}";
    }

}
