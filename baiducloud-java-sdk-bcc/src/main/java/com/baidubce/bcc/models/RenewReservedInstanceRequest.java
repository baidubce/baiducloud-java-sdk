package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RenewReservedInstanceRequest extends BaseBceRequest {

    /**
    * 实例券id集合
    */
    private List<String> reservedInstanceIds;

    /**
    * 预留实例券续费时长，支持3，6，9，12，24，36个月，必须与购买时长保持一致
    */
    private String reservedInstanceTime;

    /**
    * 预留实例券购买时长单位，默认为month，不可变更
    */
    private String reservedInstanceTimeUnit;

    /**
    * 自动续费开关，默认为false
    */
    private Boolean autoRenew;

    /**
    * 预留实例券自动续费时长单位，默认为month，不可变更
    */
    private String autoRenewTimeUnit;

    /**
    * 预留实例券自动续费时长，支持3，6，9，12，24，36个月，autoRenew为true时，必选且必须与reservedInstanceTime一致
    */
    private Integer autoRenewTime;

    public List<String> getReservedInstanceIds() {
        return reservedInstanceIds;
    }

    public RenewReservedInstanceRequest setReservedInstanceIds(List<String> reservedInstanceIds) {
        this.reservedInstanceIds = reservedInstanceIds;
        return this;
    }

    public String getReservedInstanceTime() {
        return reservedInstanceTime;
    }

    public RenewReservedInstanceRequest setReservedInstanceTime(String reservedInstanceTime) {
        this.reservedInstanceTime = reservedInstanceTime;
        return this;
    }

    public String getReservedInstanceTimeUnit() {
        return reservedInstanceTimeUnit;
    }

    public RenewReservedInstanceRequest setReservedInstanceTimeUnit(String reservedInstanceTimeUnit) {
        this.reservedInstanceTimeUnit = reservedInstanceTimeUnit;
        return this;
    }

    public Boolean getAutoRenew() {
        return autoRenew;
    }

    public RenewReservedInstanceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    public String getAutoRenewTimeUnit() {
        return autoRenewTimeUnit;
    }

    public RenewReservedInstanceRequest setAutoRenewTimeUnit(String autoRenewTimeUnit) {
        this.autoRenewTimeUnit = autoRenewTimeUnit;
        return this;
    }

    public Integer getAutoRenewTime() {
        return autoRenewTime;
    }

    public RenewReservedInstanceRequest setAutoRenewTime(Integer autoRenewTime) {
        this.autoRenewTime = autoRenewTime;
        return this;
    }

}
