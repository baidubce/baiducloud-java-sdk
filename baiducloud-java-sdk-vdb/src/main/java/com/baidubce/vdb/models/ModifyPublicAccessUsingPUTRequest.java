package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyPublicAccessUsingPUTRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * publicAccess
    */
    private Boolean publicAccess;

    public String getInstanceId() {
        return instanceId;
    }

    public ModifyPublicAccessUsingPUTRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Boolean getPublicAccess() {
        return publicAccess;
    }

    public ModifyPublicAccessUsingPUTRequest setPublicAccess(Boolean publicAccess) {
        this.publicAccess = publicAccess;
        return this;
    }

}
