package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateTemporaryPasswordRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 临时密码有效时间，单位：小时
    */
    private Integer duration;

    public String getInstanceId() {
        return instanceId;
    }

    public CreateTemporaryPasswordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public CreateTemporaryPasswordRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

}
