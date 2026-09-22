package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TdeEncryptionRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 开启TDE加密。参数可选值：open
    */
    private String action;

    public String getInstanceId() {
        return instanceId;
    }

    public TdeEncryptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAction() {
        return action;
    }

    public TdeEncryptionRequest setAction(String action) {
        this.action = action;
        return this;
    }

}
