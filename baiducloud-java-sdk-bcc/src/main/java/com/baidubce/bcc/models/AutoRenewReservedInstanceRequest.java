package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AutoRenewReservedInstanceRequest extends BaseBceRequest {

    /**
    * 实例券id集合
    */
    private List<String> reservedInstanceIds;

    /**
    * 预留实例券自动续费时长单位，默认为month，不可变更
    */
    private String autoRenewTimeUnit;

    /**
    * 预留实例券自动续费时长，支持3，6，9，12，24，36个月，必须与购买时长一致（该时长可通过预留实例券列表reservedInstanceTime字段）
    */
    private Integer autoRenewTime;

    public List<String> getReservedInstanceIds() {
        return reservedInstanceIds;
    }

    public AutoRenewReservedInstanceRequest setReservedInstanceIds(List<String> reservedInstanceIds) {
        this.reservedInstanceIds = reservedInstanceIds;
        return this;
    }

    public String getAutoRenewTimeUnit() {
        return autoRenewTimeUnit;
    }

    public AutoRenewReservedInstanceRequest setAutoRenewTimeUnit(String autoRenewTimeUnit) {
        this.autoRenewTimeUnit = autoRenewTimeUnit;
        return this;
    }

    public Integer getAutoRenewTime() {
        return autoRenewTime;
    }

    public AutoRenewReservedInstanceRequest setAutoRenewTime(Integer autoRenewTime) {
        this.autoRenewTime = autoRenewTime;
        return this;
    }

}
