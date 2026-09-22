package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateTlsEncryptionRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * open：开启；close：关闭；update：更新证书有效期。开启加密之后才能进行更新。
    */
    private String action;

    public String getInstanceId() {
        return instanceId;
    }

    public UpdateTlsEncryptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAction() {
        return action;
    }

    public UpdateTlsEncryptionRequest setAction(String action) {
        this.action = action;
        return this;
    }

}
