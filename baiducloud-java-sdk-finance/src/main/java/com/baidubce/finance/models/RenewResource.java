package com.baidubce.finance.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RenewResource {
    /**
     * 产品类型，例：BCC，BOS等
     */
    private String serviceType;

    /**
     * 区域，例如：bj
     */
    private String region;

    /**
     * 资源短ID
     */
    private String shortId;

    /**
     * 订单所有者账户ID
     */
    private String accountId;

    /**
     * 资源长ID
     */
    private String instanceId;

    /**
     * 预付费资源当前到期时间，UTC格式参考yyyy-MM-ddTHH:mm:ssZ
     */
    private String expireTime;

    /**
     * 是否可以单独开通自动续费，当前仅CDS的系统盘不支持单独开通自动续费
     */
    private Boolean aloneRenewEnable;

    /**
     * 该预付费资源实例是否已经开通了自动续费
     */
    private Boolean alreadyRenewSet;

    /**
     * 自动续费时长单位，只有两种，month&year，分别表示月和年
     */
    private String renewTimeUnit;

    /**
     * 自动续费时长，renewTimeUnit为month表示月数，renewTimeUnit为年标志年数
     */
    private String renewTime;

    public RenewResource setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    public String getServiceType() {
        return this.serviceType;
    }

    public RenewResource setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public RenewResource setShortId(String shortId) {
        this.shortId = shortId;
        return this;
    }

    public String getShortId() {
        return this.shortId;
    }

    public RenewResource setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public RenewResource setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public RenewResource setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getExpireTime() {
        return this.expireTime;
    }

    public RenewResource setAloneRenewEnable(Boolean aloneRenewEnable) {
        this.aloneRenewEnable = aloneRenewEnable;
        return this;
    }

    public Boolean getAloneRenewEnable() {
        return this.aloneRenewEnable;
    }

    public RenewResource setAlreadyRenewSet(Boolean alreadyRenewSet) {
        this.alreadyRenewSet = alreadyRenewSet;
        return this;
    }

    public Boolean getAlreadyRenewSet() {
        return this.alreadyRenewSet;
    }

    public RenewResource setRenewTimeUnit(String renewTimeUnit) {
        this.renewTimeUnit = renewTimeUnit;
        return this;
    }

    public String getRenewTimeUnit() {
        return this.renewTimeUnit;
    }

    public RenewResource setRenewTime(String renewTime) {
        this.renewTime = renewTime;
        return this;
    }

    public String getRenewTime() {
        return this.renewTime;
    }

    @Override
    public String toString() {
        return "RenewResource{" + "serviceType=" + serviceType + "\n" + "region=" + region + "\n" + "shortId=" + shortId + "\n" + "accountId=" + accountId + "\n" + "instanceId="
                + instanceId + "\n" + "expireTime=" + expireTime + "\n" + "aloneRenewEnable=" + aloneRenewEnable + "\n" + "alreadyRenewSet=" + alreadyRenewSet + "\n"
                + "renewTimeUnit=" + renewTimeUnit + "\n" + "renewTime=" + renewTime + "\n" + "}";
    }

}