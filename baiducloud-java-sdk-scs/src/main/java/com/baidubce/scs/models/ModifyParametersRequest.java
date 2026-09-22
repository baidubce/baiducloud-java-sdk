package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyParametersRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * parameter
    */
    private Parameter parameter;

    public String getInstanceId() {
        return instanceId;
    }

    public ModifyParametersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Parameter getParameter() {
        return parameter;
    }

    public ModifyParametersRequest setParameter(Parameter parameter) {
        this.parameter = parameter;
        return this;
    }

}
