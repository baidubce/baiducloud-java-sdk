package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescL2PolicyRequest extends BaseBceRequest {

    /**
    * policyId对应的pfs实例短id
    */
    private String instanceId;

    /**
    * policyId
    */
    private String policyId;

    public String getInstanceId() {
        return instanceId;
    }

    public DescL2PolicyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getPolicyId() {
        return policyId;
    }

    public DescL2PolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

}
