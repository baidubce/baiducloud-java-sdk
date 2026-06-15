package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceRecoveryRequest extends BaseBceRequest {

    /**
    * 实例ID列表，最多支持100个
    */
    private List<InstanceIdItem> instanceIds;

    public List<InstanceIdItem> getInstanceIds() {
        return instanceIds;
    }

    public InstanceRecoveryRequest setInstanceIds(List<InstanceIdItem> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

}
