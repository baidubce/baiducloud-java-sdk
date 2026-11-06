package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SetEncryptionPolicyApiRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 加密策略请求体
    */
    private List<UpdateEncryptPolicyRequest> backupPolicy;

    public String getInstanceId() {
        return instanceId;
    }

    public SetEncryptionPolicyApiRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<UpdateEncryptPolicyRequest> getBackupPolicy() {
        return backupPolicy;
    }

    public SetEncryptionPolicyApiRequest setBackupPolicy(List<UpdateEncryptPolicyRequest> backupPolicy) {
        this.backupPolicy = backupPolicy;
        return this;
    }

}
