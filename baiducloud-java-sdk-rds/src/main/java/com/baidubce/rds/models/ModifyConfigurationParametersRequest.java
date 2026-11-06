package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyConfigurationParametersRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 实际生效方式：立即执行（immediate）、维护时间执行（timewindow）
    */
    private String effectiveTime;

    /**
    * 需要修改的参数列表
    */
    private List<Parameter> parameters;

    public String getInstanceId() {
        return instanceId;
    }

    public ModifyConfigurationParametersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public ModifyConfigurationParametersRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public ModifyConfigurationParametersRequest setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
        return this;
    }

}
