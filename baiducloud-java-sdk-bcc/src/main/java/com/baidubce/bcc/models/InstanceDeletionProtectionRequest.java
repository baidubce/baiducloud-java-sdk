package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceDeletionProtectionRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 删除保护策略，默认0，不设置
    */
    private Integer deletionProtection;

    public String getInstanceId() {
        return instanceId;
    }

    public InstanceDeletionProtectionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Integer getDeletionProtection() {
        return deletionProtection;
    }

    public InstanceDeletionProtectionRequest setDeletionProtection(Integer deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }

}
