package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChangeToPrepaidRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 购买时长（单位：月）
    */
    private Integer duration;

    /**
    * 实例到期后是否自动续费，取值：true：自动续费，false：不自动续费，默认值：false。
    */
    private Boolean autoRenew;

    /**
    * 每次自动续费的时长（单位：月）。取值范围：1，2，3，4，5，6，7，8，9，12，24，36，默认值：1。仅当autoRenew取值为true，该参数有效。
    */
    private Integer autoRenewPeriod;

    /**
    * 变更关联的数据盘，已废弃，关联的按量付费（后付费）CDS需同BCC一起变更为包年包月（预付费）。
    */
    private Boolean relationCds;

    public String getInstanceId() {
        return instanceId;
    }

    public ChangeToPrepaidRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public ChangeToPrepaidRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public Boolean getAutoRenew() {
        return autoRenew;
    }

    public ChangeToPrepaidRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    public Integer getAutoRenewPeriod() {
        return autoRenewPeriod;
    }

    public ChangeToPrepaidRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }

    public Boolean getRelationCds() {
        return relationCds;
    }

    public ChangeToPrepaidRequest setRelationCds(Boolean relationCds) {
        this.relationCds = relationCds;
        return this;
    }

}
