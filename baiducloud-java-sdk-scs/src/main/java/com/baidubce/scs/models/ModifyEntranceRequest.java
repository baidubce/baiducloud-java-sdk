package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyEntranceRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 是否维护时间内执行。 <li>true：维护时间内执行 <li>false：立即执行
    */
    private Boolean isDefer;

    public String getInstanceId() {
        return instanceId;
    }

    public ModifyEntranceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Boolean getIsDefer() {
        return isDefer;
    }

    public ModifyEntranceRequest setIsDefer(Boolean isDefer) {
        this.isDefer = isDefer;
        return this;
    }

}
