package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceEnablesAutomaticRenewalRequest extends BaseBceRequest {

    /**
    * 实例ID列表
    */
    private List<String> instanceIds;

    /**
    * 自动续费周期单位（年：year；月：month）
    */
    private String autoRenewTimeUnit;

    /**
    * 续费周期按月（不超过9个月）按年付费（不超过3年）
    */
    private Integer autoRenewTime;

    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public InstanceEnablesAutomaticRenewalRequest setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public String getAutoRenewTimeUnit() {
        return autoRenewTimeUnit;
    }

    public InstanceEnablesAutomaticRenewalRequest setAutoRenewTimeUnit(String autoRenewTimeUnit) {
        this.autoRenewTimeUnit = autoRenewTimeUnit;
        return this;
    }

    public Integer getAutoRenewTime() {
        return autoRenewTime;
    }

    public InstanceEnablesAutomaticRenewalRequest setAutoRenewTime(Integer autoRenewTime) {
        this.autoRenewTime = autoRenewTime;
        return this;
    }

}
