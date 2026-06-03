package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ToggleAcceleratorFilterRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * policyId
    */
    @JsonIgnore
    private String policyId;

    /**
    * enabled
    */
    @JsonIgnore
    private String enabled;

    public String getInstanceId() {
        return instanceId;
    }

    public ToggleAcceleratorFilterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getPolicyId() {
        return policyId;
    }

    public ToggleAcceleratorFilterRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getEnabled() {
        return enabled;
    }

    public ToggleAcceleratorFilterRequest setEnabled(String enabled) {
        this.enabled = enabled;
        return this;
    }

}
