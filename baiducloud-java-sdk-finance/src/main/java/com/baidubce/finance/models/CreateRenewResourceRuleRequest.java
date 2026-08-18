package com.baidubce.finance.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateRenewResourceRuleRequest extends BaseBceRequest {

    /**
    * 账户ID，若不传，标记当前登录账户；若传，仅支持加入主账户财务圈组织的子账户的账户ID，由财务圈主账户发起请求，标志主账户代替子账户进行资源管理
    */
    private String accountId;

    /**
    * 产品类型，例：BCC，EIP等
    */
    private String serviceType;

    /**
    * 区域，例如：bj
    */
    private String region;

    /**
    * 资源长ID，是资源的唯一标示uuid，指定需要配置的资源
    */
    private String instanceId;

    /**
    * 自动续费时长单位，只有两种，month&year，分别表示按月和按年
    */
    private String renewTimeUnit;

    /**
    * 自动续费时长，renewTimeUnit为month表示月数，可选月份为1-9个月，renewTimeUnit为年标志年数，可选年数为1-3年
    */
    private String renewTime;

    public String getAccountId() {
        return accountId;
    }

    public CreateRenewResourceRuleRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getServiceType() {
        return serviceType;
    }

    public CreateRenewResourceRuleRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public CreateRenewResourceRuleRequest setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public CreateRenewResourceRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getRenewTimeUnit() {
        return renewTimeUnit;
    }

    public CreateRenewResourceRuleRequest setRenewTimeUnit(String renewTimeUnit) {
        this.renewTimeUnit = renewTimeUnit;
        return this;
    }

    public String getRenewTime() {
        return renewTime;
    }

    public CreateRenewResourceRuleRequest setRenewTime(String renewTime) {
        this.renewTime = renewTime;
        return this;
    }

}
