package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PrepayConfig {
    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * 实例到期后是否自动续费，取值：true：自动续费，false：不自动续费，默认值：false。
     */
    private Boolean autoRenew;

    /**
     * 每次自动续费的时长（单位：月）。取值范围：1，2，3，4，5，6，7，8，9，12，24，36，默认值：1。仅当autoRenew取值为true，该参数有效。
     */
    private Integer autoRenewPeriod;

    /**
     * 购买时长（单位：月）
     */
    private Integer duration;

    /**
     * （该参数已废弃，bcc挂载的按量付费CDS数据盘必须一起转包年包月）变更关联的数据盘列表，默认为空，all表示关联的全部数据盘（例"cdsList":["all"]，若仅变更部分关联数据盘，传具体的数据盘id）
     */
    private List<String> cdsList;

    /**
     * 是否自动支付，默认true，表示自动支付
     */
    private Boolean autoPay;

    public PrepayConfig setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public PrepayConfig setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public PrepayConfig setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }

    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public PrepayConfig setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public PrepayConfig setCdsList(List<String> cdsList) {
        this.cdsList = cdsList;
        return this;
    }

    public List<String> getCdsList() {
        return this.cdsList;
    }

    public PrepayConfig setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }

    public Boolean getAutoPay() {
        return this.autoPay;
    }

    @Override
    public String toString() {
        return "PrepayConfig{" + "instanceId=" + instanceId + "\n" + "autoRenew=" + autoRenew + "\n" + "autoRenewPeriod=" + autoRenewPeriod + "\n" + "duration=" + duration + "\n"
                + "cdsList=" + cdsList + "\n" + "autoPay=" + autoPay + "\n" + "}";
    }

}