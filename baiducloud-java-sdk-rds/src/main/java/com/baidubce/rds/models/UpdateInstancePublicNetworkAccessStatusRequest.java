package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateInstancePublicNetworkAccessStatusRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * true：开启公网访问 false：关闭公网访问
    */
    private Boolean publicAccess;

    public String getInstanceId() {
        return instanceId;
    }

    public UpdateInstancePublicNetworkAccessStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Boolean getPublicAccess() {
        return publicAccess;
    }

    public UpdateInstancePublicNetworkAccessStatusRequest setPublicAccess(Boolean publicAccess) {
        this.publicAccess = publicAccess;
        return this;
    }

}
