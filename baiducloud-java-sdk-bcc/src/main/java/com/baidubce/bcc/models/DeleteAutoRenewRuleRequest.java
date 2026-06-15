package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteAutoRenewRuleRequest extends BaseBceRequest {

    /**
    * 实例ID
    */
    private String instanceId;

    /**
    * 是否合并关闭eip自动续费，默认为true。
    */
    private Boolean renewEip;

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteAutoRenewRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Boolean getRenewEip() {
        return renewEip;
    }

    public DeleteAutoRenewRuleRequest setRenewEip(Boolean renewEip) {
        this.renewEip = renewEip;
        return this;
    }

}
