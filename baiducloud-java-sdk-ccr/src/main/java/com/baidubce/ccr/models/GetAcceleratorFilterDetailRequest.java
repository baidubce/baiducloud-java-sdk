package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAcceleratorFilterDetailRequest extends BaseBceRequest {

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

    public String getInstanceId() {
        return instanceId;
    }

    public GetAcceleratorFilterDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getPolicyId() {
        return policyId;
    }

    public GetAcceleratorFilterDetailRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

}
