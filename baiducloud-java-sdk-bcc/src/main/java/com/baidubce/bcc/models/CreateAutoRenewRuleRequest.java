package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAutoRenewRuleRequest extends BaseBceRequest {

    /**
    * 实例Id
    */
    private String instanceId;

    /**
    * 续费时间，单位：month，支持1, 2, 3, 4, 5, 6, 7, 8, 9；单位：year，支持1, 2, 3
    */
    private String renewTimeUnit;

    /**
    * 续费时长
    */
    private Integer renewTime;

    /**
    * 是否合并eip自动续费，默认值为true。
    */
    private Boolean renewEip;

    public String getInstanceId() {
        return instanceId;
    }

    public CreateAutoRenewRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getRenewTimeUnit() {
        return renewTimeUnit;
    }

    public CreateAutoRenewRuleRequest setRenewTimeUnit(String renewTimeUnit) {
        this.renewTimeUnit = renewTimeUnit;
        return this;
    }

    public Integer getRenewTime() {
        return renewTime;
    }

    public CreateAutoRenewRuleRequest setRenewTime(Integer renewTime) {
        this.renewTime = renewTime;
        return this;
    }

    public Boolean getRenewEip() {
        return renewEip;
    }

    public CreateAutoRenewRuleRequest setRenewEip(Boolean renewEip) {
        this.renewEip = renewEip;
        return this;
    }

}
