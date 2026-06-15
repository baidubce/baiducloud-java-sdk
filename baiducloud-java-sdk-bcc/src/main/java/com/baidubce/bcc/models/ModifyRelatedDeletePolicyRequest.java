package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyRelatedDeletePolicyRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 实例绑定的后付费EIP是否随实例关联自动释放。是：true，否：false
    */
    private Boolean isEipAutoRelatedDelete;

    public String getInstanceId() {
        return instanceId;
    }

    public ModifyRelatedDeletePolicyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Boolean getIsEipAutoRelatedDelete() {
        return isEipAutoRelatedDelete;
    }

    public ModifyRelatedDeletePolicyRequest setIsEipAutoRelatedDelete(Boolean isEipAutoRelatedDelete) {
        this.isEipAutoRelatedDelete = isEipAutoRelatedDelete;
        return this;
    }

}
