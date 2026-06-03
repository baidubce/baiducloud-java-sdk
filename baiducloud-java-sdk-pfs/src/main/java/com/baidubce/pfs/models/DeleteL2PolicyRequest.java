package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteL2PolicyRequest extends BaseBceRequest {

    /**
    * policyId对应的pfs实例短id
    */
    private String instanceId;

    /**
    * 需要删除的policyId
    */
    private String policyId;

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteL2PolicyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getPolicyId() {
        return policyId;
    }

    public DeleteL2PolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

}
