package com.baidubce.bci.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteInstanceRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * relatedReleaseFlag
    */
    @JsonIgnore
    private Boolean relatedReleaseFlag;

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Boolean getRelatedReleaseFlag() {
        return relatedReleaseFlag;
    }

    public DeleteInstanceRequest setRelatedReleaseFlag(Boolean relatedReleaseFlag) {
        this.relatedReleaseFlag = relatedReleaseFlag;
        return this;
    }

}
